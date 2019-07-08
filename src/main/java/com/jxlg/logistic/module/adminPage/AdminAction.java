package com.jxlg.logistic.module.adminPage;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxlg.logistic.module.sys.entity.Employee;
import com.jxlg.logistic.module.sys.service.ICustomService;
import com.jxlg.logistic.module.sys.service.IEmployeeService;
import com.jxlg.logistic.utils.vcode.Captcha;
import com.jxlg.logistic.utils.vcode.GifCaptcha;

@Controller
// @RequestMapping("/admin/adminIndex/")
public class AdminAction {

	@Autowired
	IEmployeeService employeeService;
	@Autowired
	ICustomService customService;

	@RequestMapping("index")
	public String page() {
		return "admin/index_layer";
	}

	@RequestMapping("/login")
	public String login() {
		return "admin/login";
	}

	/**
	 * 获取验证码（Gif版本）
	 * 
	 * @param response
	 */
	@RequestMapping(value = "getGifCode", method = RequestMethod.GET)
	public void getGifCode(HttpServletResponse response, HttpServletRequest request) {
		try {
			response.setHeader("Pragma", "No-cache");
			response.setHeader("Cache-Control", "no-cache");
			response.setDateHeader("Expires", 0);
			response.setContentType("image/gif");
			/**
			 * gif格式动画验证码 宽，高，位数。
			 */
			Captcha captcha = new GifCaptcha(146, 33, 4);
			// 输出
			captcha.out(response.getOutputStream());
			HttpSession session = request.getSession(true);
			// 存入Session
			session.setAttribute("_code", captcha.text().toLowerCase());
		} catch (Exception e) {
			System.err.println("获取验证码异常：" + e.getMessage());
		}
	}

	@RequestMapping("checkLogin")
	@ResponseBody
	public String checkLogin(HttpServletRequest request, HttpServletResponse response, Boolean rememberMe) {
		String result = "";
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		Subject employee = SecurityUtils.getSubject();
		String vcode = request.getParameter("vcode");
		Session session = SecurityUtils.getSubject().getSession();
		// 转化成小写字母
		vcode = vcode.toLowerCase();
		String v = (String) session.getAttribute("_code");
		UsernamePasswordToken token = new UsernamePasswordToken(account, password, rememberMe);
		if (!vcode.equals(v)) {
			result = "验证码错误";
		} else {
			try {
				employee.login(token);
				result = "";
			} catch (Exception e) {
				result = e.getMessage();
			}
		}
		return result;
	}

	@RequestMapping("/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		SecurityUtils.getSubject().logout();
		WebUtils.issueRedirect(request, response, "/login");
	}

	@RequestMapping("register")
	public String register() {
		return "admin/register";
	}

	@RequestMapping("403")
	public String unAuthorization(HttpSession session, HttpServletRequest request) {
		return "admin/403";
	}

	@RequestMapping("checkRegisterForEmp")
	@ResponseBody
	public String checkRegisterForEmp(HttpServletRequest request) {
		String result = "";
		String account = request.getParameter("account");
		Employee employee = employeeService.checkRegisterForEmp(account);
		if (StringUtils.isEmpty(employee)) {
			result = "";
		} else {
			result = "账号已存在，请重新输入";
		}
		return result;
	}

	@RequestMapping("saveEmp")
	@ResponseBody
	public String saveEmp(Employee employee, HttpServletRequest request) {
		String result = "";
		String flag = request.getParameter("checkbox");
		int count = 0;
		if ("on".equals(flag)) {
			Date createTime = new Date();
			employee.setEmpWorktime(createTime);
			count = employeeService.insertSelective(employee);
		}
		if (count > 0) {
			// 注册成功
			result = "注册成功";
		}
		return result;
	}

	@RequestMapping("modifyPassword")
	public String modifyPassword() {
		return "admin/modifypass";
	}

	@RequestMapping("modifyAjax")
	public String modify(Employee employee, HttpServletRequest request) {
		String result ="";
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		int count = employeeService.modifyUserAndPass(account,password);
		if(count>0) {
			//修改成功
			result="修改成功";
		}
		return result;
	}
}
