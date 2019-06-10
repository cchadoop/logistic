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
<title>权限新增|修改</title>
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
	<div class="easyui-panel" data-options="fit:true,border:false"; title="权限新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="powerId" name="powerId" value="${power.powerId }"/>
	    		</li>
	    		<li>
	    			<span>模块id</span>
	    			
	    			<select class="easyui-combobox"  id="moduleId" name="moduleId" value="${power.moduleId }"/>
	    			<c:forEach items="${listModule }" var="module">
	    				<option value="${module.moduleId}" <c:if test="${power.moduleId==order.orderId }">selected="selected"</c:if>>${module.name }</option>
	    			</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>名称</span>
	    			
	    			<input class="easyui-textbox"  id="powerName" name="powerName" value="${power.powerName }"/>
	    		</li>
	    		<li>
	    			<span>url</span>
	    			<input class="easyui-textbox validatebox" id="url" name="url" value="${power.url }" data-options="required:true,validType:'url'"  />
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