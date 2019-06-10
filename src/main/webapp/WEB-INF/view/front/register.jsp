<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="keywords" content="" />
<title>客户注册</title>
<link href="${ctx }/adminres/css/register.css" rel="stylesheet" type="text/css" media="all"/>
<script type="text/javascript" src="${ctx }/adminres/js/framework/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		//账号是否已存在
		$('#code').on('blur',function(){
			var code = $('#code').val();
			if(code==''){
				alert("账号不能为空");
			}
			$.ajax({
				url:"checkRegister",
				type:"post",
				data:{code:code},
				success:function(data){
					if(data==''){
						
					}else{
						alert(data);
						return;
					}
				}
			});
		});
		
		
		
		$('#btn').on('click',function(){
			$.ajax({
				url:"saveCustom",
				type:"post",
				data:$('#signup').serialize(),
				success:function(data){
					if(data==''){
						//注册失败
						alert(data);
					}else{
						//注册成功
						window.location.href = 'login' ;
					}
				}
			});
		});
	});
</script>
</head>
<body>
	<div class="login-section">
					<div class="clear"></div>
				</div> 
				<div class="signup">
			<div class="modal-content modal-info">
				<div class="modal-header">				
					<h3>Sign up form</h3>						
				</div>
				<div class="modal-body modal-spa">
					<div class="login-form">			
						<form id="signup">
						<ol>
							<li>
								<input type="text" id="code" name="cstCode" placeholder="Account" title="Account" required />
							</li>
							<li>
								<input type="text" id="name" name="cstName" placeholder="Name" title="Name" required />
							</li>
							<li>
								<input type="radio" id="sex" name="cstSex" value="男" placeholder="Sex" title="Sex" checked="checked" required /><span style="color:white;margin-right: 10px">男</span>
								<input type="radio" id="sex" name="cstSex" value="女" placeholder="Sex" title="Sex" required /><span style="color:white;margin-right: 10px">女</span>
							</li>
							<li>
								<input type="text" id="address" name="cstAddress" placeholder="Address" title="Address" required />
							</li>
							<li>
								<input type="email" id="email" name="cstEmail" placeholder="Mail@example.com" title="Please enter a valid email" required />
								<p class="validation01">
									<span class="invalid">Please enter a valid email address e.g. <a class="__cf_email__" href="/cdn-cgi/l/email-protection" data-cfemail="17656e767957726f767a677b723974787a">[email&#160;protected]</a><script data-cfhash='f9e31' type="text/javascript">/* <![CDATA[ */!function(t,e,r,n,c,a,p){try{t=document.currentScript||function(){for(t=document.getElementsByTagName('script'),e=t.length;e--;)if(t[e].getAttribute('data-cfhash'))return t[e]}();if(t&&(c=t.previousSibling)){p=t.parentNode;if(a=c.getAttribute('data-cfemail')){for(e='',r='0x'+a.substr(0,2)|0,n=2;a.length-n;n+=2)e+='%'+('0'+('0x'+a.substr(n,2)^r).toString(16)).slice(-2);p.replaceChild(document.createTextNode(decodeURIComponent(e)),c)}p.removeChild(t)}}catch(u){}}()/* ]]> */</script></span>
									<span class="valid">Thank you for entering a valid email</span>
								</p>
							</li>
							<li>
								<input type="tel" id="tel" name="cstPhone" pattern="\d{11}" placeholder="Please enter a phone number" required />
								<p class="validation01">
									<span class="invalid">No spaces or brackets e.g. 15979073296</span>
									<span class="valid">That's what we wanted!</span>
								</p>
							</li>
							<li>
								<input type="password" class="lock" name="cstPassword" title="Minimum 8 characters, one number, one uppercase and one lowercase letter" pattern="(?=^.{6,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*" placeholder="Password" id="password1" required />
								<p class="validation01">
									<span class="invalid">Minimum 6 characters, one number, one uppercase letter and one lowercase letter</span>
									<span class="valid">Your password meets our requirements, thank you.</span>
								</p>
							</li>
							<li>
								<input type="password" class="lock" name="confirm Password" title="Minimum 6 characters, one number, one uppercase and one lowercase letter" pattern="(?=^.{6,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*" placeholder="Confirm Password" id="password2" required />
								<p class="validation01">
									<span class="invalid">Minimum 6 characters, one number, one uppercase letter and one lowercase letter</span>
									<span class="valid">Your password meets our requirements, thank you.</span>
								</p>
							</li>
							</ol>
							<div class="signin-rit">
								<span class="checkbox1">
									 <label class="checkbox"><input type="checkbox" name="checkbox" id="checkbox" checked="">I agree to <a class="pp" href="#"> Terms</a> and <a class="pp" href="#"> Privacy Policy</a></label>
								</span>
								<div class="clear"> </div>
							</div>
							<input type="button" id="btn" value="Sign Up">
						</form>	
						<!-- script for password confirmation -->
						<script type="text/javascript">
							window.onload = function () {
								document.getElementById("password1").onchange = validatePassword;
								document.getElementById("password2").onchange = validatePassword;
							}
							function validatePassword(){
							var pass2=document.getElementById("password2").value;
							var pass1=document.getElementById("password1").value;
							if(pass1!=pass2&&pass1!=""&&pass2!=""){
								document.getElementById("password2").setCustomValidity("Passwords Don't Match");
								alert("二次密码不一致");
							}
							else
							document.getElementById("password2").setCustomValidity('');	 
							//empty string means no validation error
							}
						</script>
						<!-- //script for password confirmation -->
																											
						</div>									
					</div>
				</div>
			</div>
			<div class="clear"></div>
			<p class="footer">© 2019 User Login Form Widget. All Rights Reserved | Design by <a href="http://xmoban.cn/"> xmoban.cn</a></p>
			</div>	
</body>
</html>