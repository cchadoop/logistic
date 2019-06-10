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
<title>客户新增|修改</title>
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
	<div class="easyui-panel" data-options="fit:true,border:false"; title="客户新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="cstId" name="cstId" value="${custom.cstId }"/>
	    		</li>
	    		<li>
	    			<span>编号</span>
	    			
	    			<input class="easyui-textbox"  id="cstCode" name="cstCode" value="${custom.cstCode }"/>
	    		</li>
	    		
	    		<li>
	    			<span>姓名</span>
	    			
	    			<input class="easyui-textbox"  id="cstName" name="cstName" value="${custom.cstName }"/>
	    		</li>
	    		
	    		<li>
	    			<span>密码</span>
	    			
	    			<input class="easyui-passwordbox"  id="cstPassword" name="cstPassword" value="${custom.cstPassword }"/>
	    		</li>

	    		<li>
	    			<span>生日</span>
	    			
	    			<input class="easyui-datebox"  id="cstBirthday" name="cstBirthday" value="<fmt:formatDate value='${custom.cstBirthday}' type='date' />"/>
	    		</li>

	    		<li>
	    			<span>性别</span>
	    			
	    			<select class="easyui-combobox"  id="cstSex" name="cstSex" value="${custom.cstSex }" style="width: 130px;"/>
	    				<option value="">----请选择----</option>
	    				<option value="男">男</option>
	    				<option value="女">女</option>
	    			</select>
	    		</li>
	    		<li>
	    			<span>邮箱</span>
	    			
	    			<input class="easyui-textbox validatebox" id="cstEmail" name="cstEmail" value="${custom.cstEmail }" data-options="prompt:'Enter a valid email.',required:false,validType:'email'"  />
	    		</li>
	    		<li>
	    			<span>联系方式</span>
	    			
	    			<input class="easyui-numberbox" id="cstPhone" name="cstPhone" value="${custom.cstPhone }"/>
	    		</li>
	    		<li>
	    			<span>地址</span>
	    			
	    			<input class="easyui-textbox" id="cstAddress" name="cstAddress" value="${custom.cstAddress }" />
	    		</li>
	    		<li>
	    			<span>身份证号</span>
	    			
	    			<input class="easyui-textbox" id="cstIdcard" name="cstIdcard" value="${custom.cstIdcard }" />
	    		</li>
	    		<li>
	    			<span>创建时间</span>
	    			
	    			<input class="easyui-datetimebox" id="createTime" name="createTime" value="<fmt:formatDate value='${custom.createTime}' type='both' />" />
	    		</li>

	    		<li>
	    			<span>激活状态</span>
	    			
	    			<select class="easyui-combobox"  id="cstStatus" name="cstStatus" value="${custom.cstStatus }" style="width: 130px;"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listCstStatus}" var="dataDictionaryDetail">
						<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${custom.cstStatus==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
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