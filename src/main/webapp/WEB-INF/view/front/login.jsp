<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>神行TB</title>
	<link rel="stylesheet" href="${ctx }/adminres/css/style.css">
	<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300italic,300,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
	<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<meta name="keywords" content="Lambent Login Form Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	
	<script type="text/javascript" src="${ctx }/adminres/js/framework/jquery.min.js"></script>
	<script type="text/javascript">
	/* $("#btn").on("click",function(){ });*/
		function login(){
			var account = $('#account').val();
			if(account==''){
				alert("账号不能为空");
				return;
			}
			var password = $('#password').val();
			if(password==''){
				alert("密码不能为空");
				return;
			}
			if(account!=''&&password!=''){
				$.ajax({
					type:"post" ,
					url:'checkLogin',
					data:$('#formLogin').serialize(),
					success:function(data){
						if(data == ''){
							window.location.href = 'index' ;
						}else{
							alert(data) ;
						}
					}
				});
			}
		}
	</script>
</head>
<body>
	<h1>Lambent Login Form</h1>
	<div class="main-agileinfo">
		<h2>Login Now</h2>
		<form  id="formLogin">
			<input type="text" name="account" id="account" class="account" placeholder="Account" required>
			<input type="password" name="password" id="password" class="password" placeholder="Password" required>
			<ul>
				<li>
					<a href="register" style="color: yellow">账号未注册？</a></span>
				</li>
			</ul>
			<div class="clear"></div>
			<input type="button" value="Login" id="btn" onclick="login()">
		</form>
	</div>
	<div class="footer-w3l">
		<p class="agile"> &copy; 2016 Lambent Login Form . All Rights Reserved | Design by <a href="http://www.xmoban.cn">xmoban.cn</a></p>
	</div>
</body>
</html>