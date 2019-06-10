package com.jxlg.logistic.config;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.jxlg.logistic.sys.entity.Employee;
import com.jxlg.logistic.sys.entity.Power;
import com.jxlg.logistic.sys.service.IEmployeeService;
import com.jxlg.logistic.sys.service.IPowerService;

public class MyShiroRealm extends AuthorizingRealm {

	private static Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

	@Autowired
	private IEmployeeService employeeService;
	@Autowired
	private IPowerService powerService;

	// 认证信息，身份认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
			throws AuthenticationException {
		logger.info("身份认证方法");
		// System.out.println("身份认证方法");
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		String username = token.getUsername();
		String password = String.valueOf(token.getPassword());
		Employee employee = employeeService.checkLogin(username, password);
		if (null == employee) {
			throw new AccountException("帐号或密码不正确！");
		}
		Session session = SecurityUtils.getSubject().getSession();
		session.setAttribute("employee", employee);
		return new SimpleAuthenticationInfo(employee, employee.getEmpPassword(), getName());
	}

	// 链接权限
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		logger.info("权限验证");
		// 根据用户id查询出权限url
//		Employee employee = (Employee) principals.getPrimaryPrincipal();
		Employee employee = (Employee) getAvailablePrincipal(principals);
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		List<Power> listPower = powerService.selectPowerById(employee.getEmpId());
		Set<String> setPower = new HashSet<String>();
		for (Power power : listPower) {
			setPower.add(power.getUrl());
		}
		logger.info("权限url:"+setPower);
		info.setStringPermissions(setPower);
		return info;
	}

	/**
	 * 清除所有用户授权信息缓存.
	 */
	public void clearCachedAuthorizationInfo(String principal) {
		SimplePrincipalCollection principals = new SimplePrincipalCollection(principal, getName());
		clearCachedAuthorizationInfo(principals);
	}

	/**
	 * 清除所有用户授权信息缓存.
	 */
	public void clearAllCachedAuthorizationInfo() {
		Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
		if (cache != null) {
			for (Object key : cache.keys()) {
				cache.remove(key);
			}
		}
	}

	/**
	 * @Title: clearAuthz
	 * @Description: TODO 清楚缓存的授权信息
	 * @return void 返回类型
	 */
	public void clearAuthz() {
		this.clearCachedAuthorizationInfo(SecurityUtils.getSubject().getPrincipals());
	}
}
