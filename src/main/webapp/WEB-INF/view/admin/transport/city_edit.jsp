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
<title>城市新增|修改</title>
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
	<div class="easyui-panel" data-options="fit:true,border:false"; title="城市新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="cityId" name="cityId" value="${city.cityId }"/>
	    		</li>
	    		<li>
	    			<span>名称</span>
	    			
	    			<input class="easyui-textbox"  id="cityName" name="cityName" value="${city.cityName }"/>
	    		</li>
	    		<li>
	    			<span>省份</span>
	    			
	    			<select class="easyui-combobox"  id="provinceId" name="provinceId" value="${city.provinceId }" style="width:130px;"/>
	    				<c:forEach items="${listProvince}" var="province">
						<option value="${province.provinceId}" <c:if test="${city.provinceId==province.provinceId }">selected="selected"</c:if>>${province.provinceName }</option>
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