package com.jxlg.logistic.config;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.Filter;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import com.jxlg.logistic.filter.URLPathMatchingFilter;

/*
 * shiro 配置项
 */
@Configuration
public class ShiroConfiguration {

	public static final String LOGIN_URL = "/login";
	public static final String SUCCESS_URL = "/index";

	/*
	 * 管理bean的生命周期
	 */
	@Bean
	public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
		return new LifecycleBeanPostProcessor();
	}

	/**
	 * cookie对象; rememberMeCookie()方法是设置Cookie的生成模版，比如cookie的name，cookie的有效时间等等。
	 * 
	 * @return
	 */
	@Bean
	public SimpleCookie rememberMeCookie() {
		// 参数是cookie名称，对应前端checkbox的name = "rememberMe"
		SimpleCookie simpleCookie = new SimpleCookie("rememberMe");
		simpleCookie.setMaxAge(60 * 60); // 1小时
		return simpleCookie;
	}

	/**
	 * cookie管理对象;
	 * rememberMeManager()方法是生成rememberMe管理器，而且要将这个rememberMe管理器设置到securityManager中
	 * 
	 * @return
	 */
	@Bean
	public CookieRememberMeManager rememberMeManager() {
		CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
		cookieRememberMeManager.setCookie(rememberMeCookie());
		// rememberMe cookie加密的密钥 建议每个项目都不一样 默认AES算法 密钥长度(128 256 512 位)
		cookieRememberMeManager.setCipherKey(Base64.decode("3AvVhmFLUs0KTA3Kprsdag=="));
		return cookieRememberMeManager;
	}

	@Bean
	public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securityManager());
		shiroFilterFactoryBean.setLoginUrl(LOGIN_URL);
		shiroFilterFactoryBean.setSuccessUrl(SUCCESS_URL);
		// 配置shiro拦截器
		// 自定义过滤链
		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
		Map<String, Filter> filtersMap = new LinkedHashMap<>();
//		filtersMap.put("requestURL", getResouceCheckFilter());
		filtersMap.put("requestURL", getURLPathMachingFilter());
		// 配置不被拦截的资源及链接
		filterChainDefinitionMap.put("/static/**", "anon");
		filterChainDefinitionMap.put("/adminres/**", "anon");
		filterChainDefinitionMap.put("/getGifCode", "anon");
		filterChainDefinitionMap.put("/login", "anon");
		filterChainDefinitionMap.put("/checkLogin", "anon");
		filterChainDefinitionMap.put("/register", "anon");
		filterChainDefinitionMap.put("/checkRegisterForEmp", "anon");
		filterChainDefinitionMap.put("/saveEmp", "anon");
		filterChainDefinitionMap.put("/modify*", "anon");
		
		filterChainDefinitionMap.put("/frontres/**", "anon");
		filterChainDefinitionMap.put("/front/**", "anon");
		// 退出过滤器
		filterChainDefinitionMap.put("/logout", "logout");
		// 配置需要认证权限的
		filterChainDefinitionMap.put("/**", "authc");
		filterChainDefinitionMap.put("/**", "requestURL");

		// 未授权界面
		shiroFilterFactoryBean.setUnauthorizedUrl("/403");
		System.out.println("Shiro拦截器工厂类注入成功");
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
		shiroFilterFactoryBean.setFilters(filtersMap);
		return shiroFilterFactoryBean;
	}

	private URLPathMatchingFilter getURLPathMachingFilter() {
		return new URLPathMatchingFilter();
	}

//	private ResouceCheckFilter getResouceCheckFilter() {
//		return new ResouceCheckFilter();
//	}

	@Bean
	public SecurityManager securityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(myShiroRealm());
		securityManager.setRememberMeManager(rememberMeManager());
		return securityManager;
	}

	@Bean
	public MyShiroRealm myShiroRealm() {
		MyShiroRealm myShiroRealm = new MyShiroRealm();
		// myShiroRealm.setCredentialsMatcher(hashedCredentialsMatcher());
		return myShiroRealm;
	}

	/*
	 * 凭证匹配，加密算法MD5
	 */
	@Bean
	public HashedCredentialsMatcher hashedCredentialsMatcher() {
		HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
		credentialsMatcher.setHashAlgorithmName("MD5");
		credentialsMatcher.setHashIterations(2);
		credentialsMatcher.setStoredCredentialsHexEncoded(true);
		return credentialsMatcher;
	}

	// 开启shiro aop注解支持，不开启的话权限验证就会失效
	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
		AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
		authorizationAttributeSourceAdvisor.setSecurityManager(securityManager());
		return authorizationAttributeSourceAdvisor;
	}

	// 配置异常处理，不配置的话没有权限后台报错，前台不会跳转到403页面
	@Bean
	public SimpleMappingExceptionResolver createSimpleMappingExceptionResolver() {
		SimpleMappingExceptionResolver simpleMappingExceptionResolver = new SimpleMappingExceptionResolver();
		Properties mappings = new Properties();
		mappings.setProperty("DatabaseException", "databaseError");// 数据库异常处理
		mappings.setProperty("UnauthorizedException", "403");
		simpleMappingExceptionResolver.setExceptionMappings(mappings); // None by default
		simpleMappingExceptionResolver.setDefaultErrorView("error"); // No default
		simpleMappingExceptionResolver.setExceptionAttribute("ex"); // Default is "exception"
		return simpleMappingExceptionResolver;
	}

	/**
	 * 开启shiro授权注解，若上面Bean未生效则使用此Bean
	 * 
	 * @return
	 */
	@Bean
	@ConditionalOnMissingBean
	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
		advisorAutoProxyCreator.setProxyTargetClass(true);
		return advisorAutoProxyCreator;
	}
}
