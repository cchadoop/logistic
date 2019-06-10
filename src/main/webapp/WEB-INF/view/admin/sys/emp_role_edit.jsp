<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/view/admin/include/global.java.jsp" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
	<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>
<title>员工角色新增|修改</title>
</head>
<script type="text/javascript">
	$(function(){
		$('#onclickSave').on('click',function(){
			$.ajax({
				type:"post" ,
				url:'saveAj',
				data:$('#formEdit').serialize(),
				success:function(data){
					if(data == ''){
						window.location.href = 'page' ;
						$.messager.alert('Info','保存成功！','info');
					}else{
						alert(data) ;
					}
					
				}
			});
		});
	});
</script>
<body style="margin: 0;">
	<div class="easyui-panel" data-options="fit:true,border:false"; title="员工角色新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form  id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="empRoleId" name="empRoleId" value="${employeeRole.empRoleId }"/>
	    		</li>
	    		<li>
	    			<span>员工编号</span>
	    			
	    			<select class="easyui-combobox"  id="empId" name="empId" value="${employeeRole.empId }" style="width: 130px;"/>
	    				<c:forEach items="${listEmployee }" var="employee">
	    					<option value="${employee.empId}" <c:if test="${employeeRole.empId==employee.empId }">selected="selected"</c:if>>${employee.empCode }</option>
	    				</c:forEach>
	    			</select>
	    		</li>
	    		
	    		<li>
	    			<span>角色编号</span>
	    			
	    			<select class="easyui-combobox"  id="roleId" name="roleId" value="${employeeRole.roleId }"/>
	    				<c:forEach items="${listRole }" var="role">
	    					<option value="${role.roleId}" <c:if test="${employeeRole.roleId==role.roleId }">selected="selected"</c:if>>${role.roleName }</option>
	    				</c:forEach>
	    			</select>
	    		</li>
	    	</ul>
	    </form>
	    <div style="text-align:center;padding:5px">
	    		<a href="javascript:void(0)" class="easyui-linkbutton" id="onclickSave">保存</a>
	    </div>
	    </div>
	</div>
		

	</body>
</html>