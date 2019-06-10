<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/view/admin/include/global.java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
	<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>
<title>供应商管理</title>
</head>
	<style>
		a:link {
			text-decoration: none;
		}
	</style>
	<script type="text/javascript">
		function formatOperateColumn(value, row) {
			return '<a href="javascript:void(0);" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editRow(\'' + row.suppilerId + '\')">&nbsp;</a>' +
				'<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteRow(\'' + row.suppilerId + '\')">&nbsp;</a>';
		}
		
		function editRow(id) {
			alert('修改' + id);
			window.location.href='edit?suppilerId=' +id;
		}
		
		function onclick_deleteRows(){
			 var rows = $("#dataGridSuppiler").datagrid('getSelections');//获取选中行的所有数据
			 var ids = new Array();//构造id的数组
			 for (var i = 0; i < rows.length; i++) {
	             ids.push(rows[i].suppilerId);
	         }
			 //alert(ids) ;
			 $.ajax({
				 type:'post' ,
				 url:'deleteRowsAj' ,
				 async:true,
				 data:{"ids":ids},//提交 id数组
				 success:function(data){
					 if(data == '' || data == null){
					 	onclick_query() ;
					 }else{
						 alert(data);
					 }
				 }
				 
			 });
			 
		}
		

		function deleteRow(id) {
			alert('删除' + id);
			$.messager.confirm('Confirm','Are you sure you want to delete record?',function(r){
			    if (r){
			    	$.ajax({
						async:true, //是否异步
						type : "post",
						url : 'deleteAj?suppilerId=' + id ,
						success : function(data) {
							if(data == '' || data == null ){//成功
								$.messager.alert('提示','删除成功');
								onclick_query() ;
							}else{//失败
								alert(data.message);
							}
						}

					});
			    }
			});
		}
		
		function newUser(){
			window.location.href = 'edit' ;
		} 

		//显示
		function onclick_query(){
			$('#dataGridSuppiler').datagrid({
				/* queryParams:{
					"name":$('#name').val()
				} */
				queryParams:$('#formQuery').serializeJSON()
			});
		}
	
	</script>

<body>
	<div id="toolbar">
		<form id="formQuery">
			<div style="padding:6px;padding-top: 15px;">
				<span>名称:</span>
				<input class="easyui-textbox" id="suppilerName" name="suppilerName" style="height:20px;border:1px solid #ccc">
				<span>类型:</span>
				<select class="easyui-combobox" id="suppilerType" name="suppilerType" style="height:20px;border:1px solid #ccc">
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listSuppilerType}" var="dataDictionaryDetail">
						<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${suppiler.suppilerType==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
					</c:forEach>
				</select>
				<a href="#" class="easyui-linkbutton" style="width:60px" onclick="onclick_query()">查询</a>
			</div>
		</form>	
			<div>
				<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新增</a>
				<a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="onclick_deleteRows();">删除</a>
			</div>
	</div>

		<table id="dataGridSuppiler" class="easyui-datagrid" data-options="rownumbers:true,singleSelect:false,collapsible:true,url:'pageAjax',method:'post',pagination:true,fit:true,toolbar:'#toolbar',fitColumns:true">
			<thead>
				<tr>
					<th data-options="field:'ck',checkbox:true"></th>
					<th data-options="field:'operate_column',width:80,align:'center',formatter:formatOperateColumn">操作</th>
					<th data-options="field:'suppilerId',width:80,align:'center'">ID</th>
					<th data-options="field:'suppilerNo',width:80,align:'center'">编号</th>
					<th data-options="field:'suppilerName',width:80,align:'center'">名称</th>
					<!--<th data-options="field:'suppilerType',width:80,align:'center'">类型</th>-->
					<th data-options="field:'suppilerTypeOptionLabel',width:80,align:'center'">类型</th>
					<th data-options="field:'suppilerAddr',width:80,align:'center'">地址</th>
					<th data-options="field:'linkman',width:80,align:'center'">联系人</th>
					<th data-options="field:'linkmanTel',width:80,align:'center'">联系电话</th>
					<th data-options="field:'linkmanEmail',width:80,align:'center'">邮箱</th>
					<th data-options="field:'internetsite',width:80,align:'center'">网址</th>
					<!--<th data-options="field:'isvail',width:80,align:'center'">是否有效</th>
					<th data-options="field:'isdel',width:80,align:'center'">删除状态</th>-->
					<th data-options="field:'isvailOptionLabel',width:80,align:'center'">是否有效</th>
					<th data-options="field:'isdelOptionLabel',width:80,align:'center'">删除状态</th>
					<th data-options="field:'remark',width:80,align:'center'">备注</th>
				</tr>
			</thead>
		</table>
</body>
</html>