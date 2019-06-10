<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/view/admin/include/global.java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
	<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>
<title>仓库管理</title>
</head>
	<style>
		a:link {
			text-decoration: none;
		}
	</style>
	<script type="text/javascript">
		function formatOperateColumn(value, row) {
			return '<a href="javascript:void(0);" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editRow(\'' + row.stockId + '\')">&nbsp;</a>' +
				'<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteRow(\'' + row.stockId + '\')">&nbsp;</a>';
		}
		
		function editRow(id) {
			alert('修改' + id);
			window.location.href='edit?stockId=' +id;
		}
		
		function onclick_deleteRows(){
			 var rows = $("#dataGridStock").datagrid('getSelections');//获取选中行的所有数据
			 var ids = new Array();//构造id的数组
			 for (var i = 0; i < rows.length; i++) {
	             ids.push(rows[i].stockId);
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
						url : 'deleteAj?stockId=' + id ,
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
			$('#dataGridStock').datagrid({
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
				<span>客户姓名:</span>
				<select class="easyui-combobox"  id="cstId" name="cstId" style="width: 130px;height:20px;border:1px solid #ccc"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listCustom}" var="custom">
						<option value="${custom.cstId}" <c:if test="${stock.cstId==custom.cstId }">selected="selected"</c:if>>${custom.cstName }</option>
					</c:forEach>
	    			</select>
	    			<span>订单编号:</span>
	    			<select class="easyui-combobox"  id="orderId" name="orderId" style="width: 130px;height:20px;border:1px solid #ccc"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listOrder}" var="order">
						<option value="${order.orderId}" <c:if test="${stock.orderId==order.orderId }">selected="selected"</c:if>>${order.orderNo }</option>
					</c:forEach>
	    			</select>
	    			<span>收货单号:</span>
	    			<select class="easyui-combobox"  id="receiveId" name="receiveId" style="width: 130px;height:20px;border:1px solid #ccc"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listReceive}" var="receive">
						<option value="${receive.receiveId}" <c:if test="${stock.receiveId==receive.receiveId }">selected="selected"</c:if>>${receive.receiveNo }</option>
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

		<table id="dataGridStock" class="easyui-datagrid" data-options="rownumbers:true,singleSelect:false,collapsible:true,url:'pageAjax',method:'post',pagination:true,fit:true,toolbar:'#toolbar',fitColumns:true">
			<thead>
				<tr>
					<th data-options="field:'ck',checkbox:true"></th>
					<th data-options="field:'operate_column',width:80,align:'center',formatter:formatOperateColumn">操作</th>
					<th data-options="field:'stockId',width:80,align:'center'">ID</th>
					<th data-options="field:'stockNo',width:80,align:'center'">编号</th>
					<th data-options="field:'stockName',width:80,align:'center'">名称</th>
					<th data-options="field:'stockAddr',width:80,align:'center'">地址</th>
					<!-- <th data-options="field:'cstId',width:80,align:'center'">客户编号</th>
					<th data-options="field:'orderId',width:80,align:'center'">订单编号</th>
					<th data-options="field:'receiveId',width:80,align:'center'">收货单号</th> -->
					<th data-options="field:'cstName',width:80,align:'center'">客户姓名</th>
					<th data-options="field:'orderNo',width:80,align:'center'">订单编号</th>
					<th data-options="field:'receiveNo',width:80,align:'center'">收货单号</th>
					<th data-options="field:'instockTime',width:80,align:'center',formatter:formatDateTime">入库时间</th>
					<th data-options="field:'position',width:80,align:'center'">库位</th>
					<th data-options="field:'pkgs',width:80,align:'center'">件数</th>
					<th data-options="field:'weight',width:80,align:'center'">重量</th>
					<th data-options="field:'cbm',width:80,align:'center'">卡板体积</th>
					<th data-options="field:'l',width:80,align:'center'">卡板长</th>
					<th data-options="field:'w',width:80,align:'center'">卡板宽</th>
					<th data-options="field:'h',width:80,align:'center'">卡板高</th>
				</tr>
			</thead>
		</table>
</body>
</html>