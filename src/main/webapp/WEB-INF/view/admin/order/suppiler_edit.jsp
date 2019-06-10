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
<title>供应商新增|修改</title>
<style type="text/css">
	.form_layout>li>span{
		width:90px;
	}
</style>
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
	<div class="easyui-panel" data-options="fit:true,border:false"; title="供应商新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="suppilerId" name="suppilerId" value="${suppiler.suppilerId }"/>
	    		</li>
	    		<li>
	    			<span>编号</span>
	    			
	    			<input class="easyui-textbox"  id="suppilerNo" name="suppilerNo" value="${suppiler.suppilerNo }"/>
	    		</li>
	    		<li>
	    			<span>名称</span>
	    			
	    			<input class="easyui-textbox"  id="suppilerName" name="suppilerName" value="${suppiler.suppilerName }"/>
	    		</li>
	    		<li>
	    			<span>类型</span>
	    			
	    			<select class="easyui-combobox"  id="suppilerType" name="suppilerType" value="${suppiler.suppilerType }" style="width: 130px;"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listSuppilerType}" var="dataDictionaryDetail">
						<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${suppiler.suppilerType==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
					</c:forEach>
				</select>
	    		</li>
	    		<li>
	    			<span>地址</span>
	    			
	    			<input class="easyui-textbox"  id="suppilerAddr" name="suppilerAddr" value="${suppiler.suppilerAddr }"/>
	    		</li>
	    		<li>
	    			<span>联系人</span>
	    			
	    			<input class="easyui-textbox"  id="linkman" name="linkman" value="${suppiler.linkman }"/>
	    		</li>
	    		<li>
	    			<span>联系电话</span>
	    			
	    			<input class="easyui-numberbox"  id="linkmanTel" name="linkmanTel" value="${suppiler.linkmanTel }"/>
	    		</li>
	    		<li>
	    			<span>邮箱</span>
	    			<input class="easyui-textbox validatebox" id="linkmanEmail" name="linkmanEmail" value="${suppiler.linkmanEmail }"  data-options="prompt:'Enter a valid email.',required:false,validType:'email'"  />
	    		</li>
	    		<li>
	    			<span>网址</span>
	    			
	    			<input class="easyui-textbox"  id="internetsite" name="internetsite" value="${suppiler.internetsite }"/>
	    		</li>
	    		<li>
	    			<span>是否有效</span>
	    			
	    			<select class="easyui-combobox"  id="isvail" name="isvail" value="${suppiler.isvail }" style="width: 130px;"/>
	    			<option value="">----请选择----</option>
	    				<c:forEach items="${listIsVail}" var="dataDictionaryDetail">
						<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${suppiler.isvail==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
					</c:forEach>
				</select>
	    		</li>
	    		<li>
	    			<span>删除状态</span>
	    			
	    			<select class="easyui-combobox"  id="isdel" name="isdel" value="${suppiler.isdel }" style="width: 130px;"/>
	    			<option value="">----请选择----</option>
	    				<c:forEach items="${listIsDel}" var="dataDictionaryDetail">
						<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${suppiler.isdel==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
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