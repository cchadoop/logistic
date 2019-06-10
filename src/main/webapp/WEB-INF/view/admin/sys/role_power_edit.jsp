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
<title>角色权限新增|修改</title>
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
						$.messager.alert('Info','保存失败！','info');
					}
					
				}
			});
		});
	});
</script>
</head>

<body style="margin: 0;">
	<div class="easyui-panel" data-options="fit:true,border:false"; title="角色权限新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="rolePowerId" name="rolePowerId" value="${rolePower.rolePowerId }"/>
	    		</li>
	    		<li>
	    			<span>角色id</span>
	    			
	    			<select class="easyui-combobox"  id="roleId" name="roleId" value="${rolePower.roleId }" style="width: 130px;"/>
	    				<c:forEach items="${listRole }" var="role">
	    					<option value="${role.roleId}" <c:if test="${rolePower.roleId==role.roleId }">selected="selected"</c:if>>${role.roleName }</option>
	    				</c:forEach>
	    			</select>
	    		</li>
	    		
	    		<li>
	    			<span>权限id</span>
	    			
	    			<select class="easyui-combobox"  id="powerId" name="powerId" value="${rolePower.powerId }" style="width:130px;"/>
	    				<c:forEach items="${listPower }" var="power">
	    					<option value="${power.powerId}" <c:if test="${rolePower.powerId==power.powerId }">selected="selected"</c:if>>${power.powerName }</option>
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