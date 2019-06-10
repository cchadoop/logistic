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
<title>司机新增|修改</title>
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
	<div class="easyui-panel" data-options="fit:true,border:false"; title="司机新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="driverId" name="driverId" value="${driver.driverId }"/>
	    		</li>
	    		<li>
	    			<span>姓名</span>
	    			
	    			<input class="easyui-textbox"  id="driverName" name="driverName" value="${driver.driverName }"/>
	    		</li>
	    		<li>
	    			<span>性别</span>
	    			
	    			<select class="easyui-combobox"  id="driverSex" name="driverSex" value="${driver.driverSex }" style="width: 130px;"/>
	    				<option value="">----请选择----</option>
	    				<option value="男">男</option>
	    				<option value="女">女</option>
	    			</select>
	    		</li>
	    		<li>
	    			<span>联系电话</span>
	    			
	    			<input class="easyui-numberbox"  id="driverTel" name="driverTel" value="${driver.driverTel }"/>
	    		</li>
	    		<li>
	    			<span>身份证号</span>
	    			
	    			<input class="easyui-textbox"  id="driverIdcard" name="driverIdcard" value="${driver.driverIdcard }"/>
	    		</li>
	    		<li>
	    			<span>创建时间</span>
	    			
	    			<input class="easyui-datetimebox"  id="createTime" name="createTime" value="<fmt:formatDate value='${driver.createTime}' type='both' />"/>
	    		</li>
	    		<li>
	    			<span>驾驶年限</span>
	    			
	    			<input class="easyui-numberbox"  id="driverTime" name="driverTime" value="${driver.driverTime }" data-options="precision:1"/>
	    		</li>
	    		<li>
	    			<span>认证状态</span>
	    			
	    			<select class="easyui-combobox"  id="driverStatus" name="driverStatus" value="${driver.driverStatus }" style="width: 130px;"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listDriverStatus}" var="dataDictionaryDetail">
						<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${driver.driverStatus==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
					</c:forEach>
				</select>
	    		</li>
	    		<li>
	    			<span>备注</span>
	    			
	    			<input class="easyui-textbox"  id="remark" name="remark" value="${driver.remark }"/>
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