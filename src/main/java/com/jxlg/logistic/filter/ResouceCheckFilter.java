package com.jxlg.logistic.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResouceCheckFilter extends AccessControlFilter{
	
	private static final Logger logger = LoggerFactory.getLogger(ResouceCheckFilter.class);

	/**
     * 表示是否允许访问 ，如果允许访问返回true，否则false；
     * @param servletRequest
     * @param servletResponse
     * @param o 表示写在拦截器中括号里面的字符串 mappedValue 就是 [urls] 配置中拦截器参数部分
     * @return
     * @throws Exception
     */
	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object arg2) throws Exception {
		Subject subject = getSubject(request,response);
        String url = getPathWithinApplication(request);
        logger.debug("当前用户正在访问的 url => " + url);
        return subject.isPermitted(url);
	}

	@Override
	protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
		logger.debug("当 isAccessAllowed 返回 false 的时候，才会执行 method onAccessDenied ");

        HttpServletRequest request =(HttpServletRequest) servletRequest;
        HttpServletResponse response =(HttpServletResponse) servletResponse;
        response.sendRedirect(request.getContextPath() + "/403");
        // 返回 false 表示已经处理，例如页面跳转啥的，表示不在走以下的拦截器了（如果还有配置的话）
        return false;
	}

}
