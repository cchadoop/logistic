package com.jxlg.logistic.filter;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.AntPathMatcher;
import org.apache.shiro.util.PatternMatcher;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.jxlg.logistic.module.sys.entity.Employee;
import com.jxlg.logistic.module.sys.entity.Power;
import com.jxlg.logistic.module.sys.service.IPowerService;
import com.jxlg.logistic.utils.SpringContextUtil;
public class URLPathMatchingFilter extends PathMatchingFilter{
	
	@Autowired
	IPowerService powerService;
	
	private static final Logger logger = LoggerFactory.getLogger(URLPathMatchingFilter.class);
	
	@Override
	protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {
		if(powerService==null) {
			powerService = SpringContextUtil.getContext().getBean(IPowerService.class);
		}
		
		String requestURL = getPathWithinApplication(request);
		logger.debug("请求的:"+requestURL);
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		Employee employee = (Employee) session.getAttribute("employee");
		if(null==employee) {
			WebUtils.issueRedirect(request, response, "/login");
		}
		if("/index".equals(requestURL)) {
			return true;
		}
		if("/logout".equals(requestURL)) {
			return true;
		}
		if("/403".equals(requestURL)) {
			return true;
		}
		if(!subject.isAuthenticated()) {
			return true;
		}
		
		List<Power> powers = powerService.selectPowerById(employee.getEmpId()); //powerService  为Null
		PatternMatcher patternMatcher = new AntPathMatcher();
		boolean hasPower = false;
		for (Power power : powers) {
			boolean flag = patternMatcher.matches(power.getUrl(),requestURL);
			if(flag) {
				hasPower = true;
				break;
			}
		}
		if(hasPower) {
			return true;
		}else {
			UnauthenticatedException ex = new UnauthenticatedException("当前用户没有访问路径"+requestURL+"的权限");
			session.setAttribute("ex", ex);
			WebUtils.issueRedirect(request, response, "/403");
			return false;
		}
	}
}
