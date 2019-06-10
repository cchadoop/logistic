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
<title>修改密码</title>
<link href="${ctx }/adminres/css/register.css" rel="stylesheet" type="text/css" media="all"/>
<script type="text/javascript" src="${ctx }/adminres/js/framework/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		
		$('#confirmPass').on('blur',function(){
			var password = $('#empPassword').val();
			var confirmPass = $('#confirmPass').val();
			if(password!=confirmPass){
				alert("两次密码不相同，请重新输入!");
			}
		});
		
		
		$('#empAccount').on('blur',function(){
			var account = $('#empAccount').val();
			$.ajax({
				url:"checkRegisterForEmp",
				type:"post",
				data:{account:account},
				success:function(data){
					if(data==''){
						alert("该账号不存在，请重新输入或注册账号");
					}else{
						
					}
				}
			});
		});
		
		//确认后
		$('#btn').on('click',function(){
			$.ajax({
				type:"post",
				url:"/modifyAjax",
				data:{
					"account":$('#empAccount').val(),
					"password":$('#empPassword').val()
				},
				success:function(data){
					if(data==''){
						
					}else{
						//result ="修改成功"
						alert("修改成功！");
						window.location.href="/login";
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
				<h3>Modify Password</h3>						
			</div>
			<div class="modal-body modal-spa">
				<div class="login-form">			
					<form action="/modify" method="post" id="signup">
						<ol>
							<li>
								<input type="text" id="empAccount" name="empAccount" placeholder="账号" title="Name" required />
								
							</li>
							<li>
								<input type="password" id="empPassword" name="empPassword" placeholder="密码" title="Name" required />
							</li>
							<li>
								<input type="password" id="confirmPass" name="confirmPass" placeholder="再次确认密码" title="Name" required />
							</li>
						</ol>
						<a href="register" style="color: #ccc;float: right;margin-bottom: 10px;">没有账号?请注册</a>
						<input type="button" id="btn" value="Confirm">
					</form>
					
				</div>									
			</div>
		</div>
	</div>
	<div class="clear"></div>
		<p class="footer">© 2019 User Login Form Widget. All Rights Reserved | Design by CC</p>
	</div>	
</body>
</html>