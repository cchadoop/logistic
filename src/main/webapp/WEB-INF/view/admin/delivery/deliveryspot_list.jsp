<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/view/admin/include/global.java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
	<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>
<title>配送中心</title>
</head>
	<style>
		a:link {
			text-decoration: none;
		}
	</style>
	<script type="text/javascript">
		function formatOperateColumn(value, row) {
			return '<a href="javascript:void(0);" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editRow(\'' + row.deliveryspotId + '\')">&nbsp;</a>' +
				'<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteRow(\'' + row.deliveryspotId + '\')">&nbsp;</a>';
		}
		
		function editRow(id) {
			alert('修改' + id);
			window.location.href='edit?deliveryspotId=' +id;
		}
		
		function onclick_deleteRows(){
			 var rows = $("#dataGridDeliveryspot").datagrid('getSelections');//获取选中行的所有数据
			 var ids = new Array();//构造id的数组
			 for (var i = 0; i < rows.length; i++) {
	             ids.push(rows[i].deliveryspotId);
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
						url : 'deleteAj?deliveryspotId=' + id ,
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
			$('#dataGridDeliveryspot').datagrid({
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
				<span>城市:</span>
				<select class="easyui-combobox"  id="cityId" name="cityId"  style="width: 130px;height:20px;border:1px solid #ccc"/>
	    				<c:forEach items="${listCity}" var="city">
						<option value="${city.cityId}" <c:if test="${deliveryspot.cityId==city.cityId }">selected="selected"</c:if>>${city.cityName }</option>
					</c:forEach>
	    			</select>
				<span>配送状态:</span>
				<select class="easyui-combobox"  id="deliveryStatus" name="deliveryStatus" style="width: 130px;height:20px;border:1px solid #ccc"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listDeliveryStatus}" var="dataDictionaryDetail">
						<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${deliveryspot.deliveryStatus==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
					</c:forEach>
	    			</select>
				<span>配送时间:</span>
				<input class="easyui-datebox" id="minDate" name="minDate" style="height:20px;border:1px solid #ccc">
				——
				<input class="easyui-datebox" id="maxDate" name="maxDate" style="height:20px;border:1px solid #ccc">
				<a href="#" class="easyui-linkbutton" style="width:60px" onclick="onclick_query()">查询</a>
			</div>
		</form>	
			<div>
				<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新增</a>
				<a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="onclick_deleteRows();">删除</a>
			</div>
	</div>

		<table id="dataGridDeliveryspot" class="easyui-datagrid" data-options="rownumbers:true,singleSelect:false,collapsible:true,url:'pageAjax',method:'post',pagination:true,fit:true,toolbar:'#toolbar',fitColumns:true">
			<thead>
				<tr>
					<th data-options="field:'ck',checkbox:true"></th>
					<th data-options="field:'operate_column',width:80,align:'center',formatter:formatOperateColumn">操作</th>
					<th data-options="field:'deliveryspotId',width:80,align:'center'">ID</th>
					<th data-options="field:'deliveryspotNo',width:80,align:'center'">编号</th>
					<th data-options="field:'deliveryspotName',width:80,align:'center'">名称</th>
					<!-- <th data-options="field:'cityId',width:80,align:'center'">城市</th>
					<th data-options="field:'empId',width:80,align:'center'">员工</th> -->
					<th data-options="field:'cityName',width:80,align:'center'">城市</th>
					<th data-options="field:'deliveryspotName',width:80,align:'center'">详细地址</th>
					<th data-options="field:'empName',width:80,align:'center'">员工</th>
					<th data-options="field:'tel',width:80,align:'center'">联系电话</th>
					<th data-options="field:'firstWeightScope',width:80,align:'center'">首重量范围(kg)</th>
					<th data-options="field:'firstWeightPrice',width:80,align:'center'">首重量价格(元)</th>
					<th data-options="field:'secondWeightRate',width:80,align:'center'">次重量系数(元/kg)</th>
					<th data-options="field:'firstVolumeScope',width:80,align:'center'">首体积范围(m³)</th>
					<th data-options="field:'firstVolumePrice',width:80,align:'center'">首体积价格(元)</th>
					<th data-options="field:'secondVolumeRate',width:80,align:'center'">次体积系数(元/m³)</th>
					<th data-options="field:'deliveryTime',width:100,align:'center',formatter:formatDateTime">配送时间</th>
					<!-- <th data-options="field:'deliveryStatus',width:80,align:'center'">配送状态</th> -->
					<th data-options="field:'deliveryStatusOptionLabel',width:80,align:'center'">配送状态</th>
				</tr>
			</thead>
		</table>
</body>
</html>