<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/view/admin/include/global.java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
	<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>
<title>客户管理</title>
</head>
	<style>
		a:link {
			text-decoration: none;
		}
	</style>
	<script type="text/javascript">
		function formatOperateColumn(value, row) {
			return '<a href="javascript:void(0);" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editRow(\'' + row.cstId + '\')">&nbsp;</a>' +
				'<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteRow(\'' + row.cstId + '\')">&nbsp;</a>';
		}
		
		function editRow(id) {
			alert('修改' + id);
			window.location.href='edit?cstId=' +id;
		}
		
		function onclick_deleteRows(){
			 var rows = $("#dataGridCustom").datagrid('getSelections');//获取选中行的所有数据
			 var ids = new Array();//构造id的数组
			 for (var i = 0; i < rows.length; i++) {
	             ids.push(rows[i].cstId);
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
						url : 'deleteAj?cstId=' + id ,
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
			$('#dataGridCustom').datagrid({
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
				<span>姓名:</span>
				<input class="easyui-textbox" id="cstName" name="cstName" style="height:20px;border:1px solid #ccc">
				<span>联系电话:</span>
				<input class="easyui-textbox" id="cstPhone" name="cstPhone" style="height:20px;border:1px solid #ccc">
				<a href="#" class="easyui-linkbutton" style="width:60px" onclick="onclick_query()">查询</a>
			</div>
		</form>	
			<div>
				<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新增</a>
				<a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="onclick_deleteRows();">删除</a>
			</div>
	</div>

		<table id="dataGridCustom" class="easyui-datagrid" data-options="rownumbers:true,singleSelect:false,collapsible:true,url:'pageAjax',method:'post',pagination:true,fit:true,toolbar:'#toolbar',fitColumns:true">
			<thead>
				<tr>
					<th data-options="field:'ck',checkbox:true"></th>
					<th data-options="field:'operate_column',width:80,align:'center',formatter:formatOperateColumn">操作</th>
					<th data-options="field:'cstId',width:80,align:'center'">ID</th>
					<th data-options="field:'cstCode',width:80,align:'center'">编号</th>
					<th data-options="field:'cstName',width:80,align:'center'">姓名</th>
					<th data-options="field:'cstPassword',width:80,align:'center'">密码</th>
					<th data-options="field:'cstBirthday',width:80,align:'center',formatter:formatDate">生日</th>
					<th data-options="field:'cstSex',width:80,align:'center'">性别</th>
					<th data-options="field:'cstEmail',width:80,align:'center'">邮箱</th>
					<th data-options="field:'cstPhone',width:80,align:'center'">联系方式</th>
					<th data-options="field:'cstAddress',width:80,align:'center'">地址</th>
					<th data-options="field:'cstIdcard',width:80,align:'center'">身份证号</th>
					<th data-options="field:'createTime',width:80,align:'center',formatter:formatDateTime">创建时间</th>
					<!-- <th data-options="field:'cstStatus',width:80,align:'center'">激活状态</th> -->
					<th data-options="field:'cstStatusOptionLabel',width:80,align:'center'">激活状态</th>
				</tr>
			</thead>
		</table>
</body>
</html>