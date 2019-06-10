<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/view/admin/include/global.java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
	<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>
<title>订单详情管理</title>
</head>
	<style>
		a:link {
			text-decoration: none;
		}
	</style>
	<script type="text/javascript">
		function formatOperateColumn(value, row) {
			return '<a href="javascript:void(0);" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editRow(\'' + row.orderdetailId + '\')">&nbsp;</a>' +
				'<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteRow(\'' + row.orderdetailId + '\')">&nbsp;</a>';
		}
		
		function editRow(id) {
			alert('修改' + id);
			window.location.href='edit?orderdetailId=' +id;
		}
		
		function onclick_deleteRows(){
			 var rows = $("#dataGridOrderDetail").datagrid('getSelections');//获取选中行的所有数据
			 var ids = new Array();//构造id的数组
			 for (var i = 0; i < rows.length; i++) {
	             ids.push(rows[i].orderdetailId);
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
						url : 'deleteAj?orderdetailId=' + id ,
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
			$('#dataGridOrderDetail').datagrid({
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
				<span>货物名称:</span>
				<input class="easyui-textbox" id="goodsName" name="goodsName" style="height:20px;border:1px solid #ccc">
				<span>总金额:</span>
				<input class="easyui-numberbox" id="minPrice" name="minPrice" style="height:20px;border:1px solid #ccc">
				——
				<input class="easyui-numberbox" id="maxPrice" name="maxPrice" style="height:20px;border:1px solid #ccc">
				<a href="#" class="easyui-linkbutton" style="width:60px" onclick="onclick_query()">查询</a>
			</div>
		</form>	
			<div>
				<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新增</a>
				<a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="onclick_deleteRows();">删除</a>
			</div>
	</div>

		<table id="dataGridOrderDetail" class="easyui-datagrid" data-options="rownumbers:true,singleSelect:false,collapsible:true,url:'pageAjax',method:'post',pagination:true,fit:true,toolbar:'#toolbar',fitColumns:true">
			<thead>
				<tr>
					<th data-options="field:'ck',checkbox:true"></th>
					<th data-options="field:'operate_column',width:80,align:'center',formatter:formatOperateColumn">操作</th>
					<th data-options="field:'orderdetailId',width:80,align:'center'">ID</th>
					<!-- <th data-options="field:'orderId',width:80,align:'center'">订单编号</th> -->
					<th data-options="field:'orderNo',width:80,align:'center'">订单编号</th>
					<th data-options="field:'goodsName',width:80,align:'center'">货物名称</th>
					<th data-options="field:'number',width:80,align:'center'">数量(件)</th>
					<th data-options="field:'volume',width:80,align:'center'">体积(m³)</th>
					<th data-options="field:'weight',width:80,align:'center'">重量(kg)</th>
					<th data-options="field:'totalPrice',width:80,align:'center'">总金额</th>
					<th data-options="field:'createTime',width:80,align:'center',formatter:formatDateTime">创建时间</th>
					<th data-options="field:'updateTime',width:80,align:'center',formatter:formatDateTime">更新时间</th>
					<!-- <th data-options="field:'deliveryspotId',width:80,align:'center'">配送点编号</th>
					<th data-options="field:'suppilerId',width:80,align:'center'">供应商编号</th> -->
					<th data-options="field:'deliveryspotNo',width:80,align:'center'">配送点编号</th>
					<th data-options="field:'suppilerNo',width:80,align:'center'">供应商编号</th>
				</tr>
			</thead>
		</table>
</body>
</html>