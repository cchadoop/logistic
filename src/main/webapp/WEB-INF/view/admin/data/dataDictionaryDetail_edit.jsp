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
<title>数据字典详情新增|修改</title>
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
	<div class="easyui-panel" data-options="fit:true,border:false"; title="数据字典详情新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="dictionaryDetailId" name="dictionaryDetailId" value="${dataDictionaryDetail.dictionaryDetailId }"/>
	    		</li>
	    		<li>
	    			<span>数据字典ID</span>
	    			
	    			<input class="easyui-combobox"  id="dataDictionaryId" name="dataDictionaryId" value="${dataDictionaryDetail.dataDictionaryId }"/>
	    		</li>
	    		<li>
	    			<span>编码</span>
	    			
	    			<input class="easyui-textbox"  id="dictionaryDetailCode" name="dictionaryDetailCode" value="${dataDictionaryDetail.dictionaryDetailCode }"/>
	    		</li>
	    		<li>
	    			<span>标签</span>
	    			
	    			<input class="easyui-textbox"  id="dictionaryDetailLabel" name="dictionaryDetailLabel" value="${dataDictionaryDetail.dictionaryDetailLabel }"/>
	    		</li>
	    		<li>
	    			<span>序号</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:0" id="dictionaryDetailXh" name="dictionaryDetailXh" value="${dataDictionaryDetail.dictionaryDetailXh }"/>
	    		</li>
	    		<li>
	    			<span>选项标签</span>
	    			
	    			<input class="easyui-textbox"  id="optionLabel" name="optionLabel" value="${dataDictionaryDetail.optionLabel }"/>
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