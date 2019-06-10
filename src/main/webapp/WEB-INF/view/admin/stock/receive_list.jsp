<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/view/admin/include/global.java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
	<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>
<title>收货作业管理</title>
</head>
	<style>
		a:link {
			text-decoration: none;
		}
	</style>
	<script type="text/javascript">
		function formatOperateColumn(value, row) {
			return '<a href="javascript:void(0);" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editRow(\'' + row.receiveId + '\')">&nbsp;</a>' +
				'<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteRow(\'' + row.receiveId + '\')">&nbsp;</a>';
		}
		
		function editRow(id) {
			alert('修改' + id);
			window.location.href='edit?receiveId=' +id;
		}
		
		function onclick_deleteRows(){
			 var rows = $("#dataGridReceive").datagrid('getSelections');//获取选中行的所有数据
			 var ids = new Array();//构造id的数组
			 for (var i = 0; i < rows.length; i++) {
	             ids.push(rows[i].receiveId);
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
						url : 'deleteAj?receiveId=' + id ,
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
			$('#dataGridReceive').datagrid({
				/* queryParams:{
					"name":$('#name').val()
				} */
				queryParams:$('#formQuery').serializeJSON()
			});
		}
		//导出Excel
		function excel(){
			/* $("#dataGridReceive").table2excel({
				exclude: ".noExl",
				name: "Excel Document Name",
				filename: "收货作业" + new Date().toISOString().replace(/[\-\:\.]/g, ""),
				fileext: ".xls",
				exclude_img: true,
				exclude_links: true,
				exclude_inputs: true
			}); */
			
			$('#dataGridReceive').datagrid('toExcel',{
				filename:'收货作业报表'+new Date().toISOString().replace(/[\-\:\.]/g, "")+'.xls',
				worksheet:'收货作业Xls'
			}); 
			
			
		}
	
	</script>

<body>
	<div id="toolbar">
		<form id="formQuery">
			<div style="padding:6px;padding-top: 15px;">
				<span>订单编号:</span>
				<select class="easyui-combobox"  id="orderId" name="orderId"  style="width: 130px;height:20px;border:1px solid #ccc"/>
	    				<option value="">----请选择----</option> 
	    				<c:forEach items="${listOrder}" var="order">
						<option value="${order.orderId}" <c:if test="${receive.orderId==order.orderId }">selected="selected"</c:if>>${order.orderNo }</option>
					</c:forEach>
	    			</select>
				<span>收货时间:</span>
				<input class="easyui-datebox" id="minDate" name="minDate" style="height:20px;border:1px solid #ccc">
				——
				<input class="easyui-datebox" id="maxDate" name="maxDate" style="height:20px;border:1px solid #ccc">
				<a href="#" class="easyui-linkbutton" style="width:60px" onclick="onclick_query()">查询</a>
			</div>
		</form>	
			<div>
				<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新增</a>
				<a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="onclick_deleteRows();">删除</a>
				<a href="javascript:void(0);" class="easyui-linkbutton" style="color:green;" plain="true" onclick="excel();"><img src="${ctx}/adminres/images/export.png" style="width:15px;height:15px;"/>导出</a>
			</div>
	</div>

		<table id="dataGridReceive" class="easyui-datagrid" data-options="rownumbers:true,singleSelect:true,collapsible:true,url:'pageAjax',method:'post',pagination:true,fit:true,toolbar:'#toolbar',fitColumns:true">
			<thead>
				<tr>
					<th data-options="field:'ck',checkbox:true"></th>
					<th data-options="field:'operate_column',width:80,align:'center',formatter:formatOperateColumn">操作</th>
					<th data-options="field:'receiveId',width:80,align:'center'">ID</th>
					<th data-options="field:'receiveNo',width:80,align:'center'">编号</th>
					<!--<th data-options="field:'orderId',width:80,align:'center'">订单编号</th>-->
					<th data-options="field:'orderNo',width:80,align:'center'">订单编号</th>
					<th data-options="field:'receivePerson',width:80,align:'center'">收货人</th>
					<th data-options="field:'receiveTime',width:80,align:'center',formatter:formatDateTime">收货时间</th>
					<!--<th data-options="field:'receiveStatus',width:80,align:'center'">收货状态</th>
					<th data-options="field:'receiveWay',width:80,align:'center'">收货方式</th>-->
					<th data-options="field:'receiveStatusOptionLabel',width:80,align:'center'">收货状态</th>
					<th data-options="field:'receiveWayOptionLabel',width:80,align:'center'">收货方式</th>
					<th data-options="field:'confirmTime',width:80,align:'center',formatter:formatDateTime"">确认时间</th>
					<th data-options="field:'confirmAddr',width:80,align:'center'">确认地址</th>
					<th data-options="field:'confirmPerson',width:80,align:'center'">确认人</th>
				</tr>
			</thead>
		</table>
</body>
</html>