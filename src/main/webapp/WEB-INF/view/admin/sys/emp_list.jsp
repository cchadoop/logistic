<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/view/admin/include/global.java.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
	<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>
<title>员工管理</title>
</head>
	<style>
		a:link {
			text-decoration: none;
		}
	</style>
	<script type="text/javascript">
		function formatOperateColumn(value, row) {
			return '<a href="javascript:void(0);" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editRow(\'' + row.empId + '\')">&nbsp;</a>' +
				'<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteRow(\'' + row.empId + '\')">&nbsp;</a>';
		}
		
		function editRow(id) {
			alert('修改' + id);
			window.location.href='edit?empId=' +id;
		}
		
		function onclick_deleteRows(){
			 var rows = $("#dataGridEmployee").datagrid('getSelections');//获取选中行的所有数据
			 var ids = new Array();//构造id的数组
			 for (var i = 0; i < rows.length; i++) {
	             ids.push(rows[i].empId);
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
						url : 'deleteAj?empId=' + id ,
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
			$('#dataGridEmployee').datagrid({
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
				<input class="easyui-textbox" id="empName" name="empName" style="height:20px;border:1px solid #ccc">
				<span>在职状况:</span>
				<select class="easyui-combobox" id="empWorkStatus" name="empWorkStatus" style="height:20px;border:1px solid #ccc">
					<option value="">----请选择----</option>
					<c:forEach items="${listEmpWorkStatus }" var="dataDictionaryDetail">
		    				<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${employee.empWorkStatus==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
		    			</c:forEach>
				</select>
				<span>入职时间:</span>
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

		<table id="dataGridEmployee" class="easyui-datagrid" data-options="rownumbers:true,singleSelect:false,collapsible:true,url:'pageAjax',method:'post',pagination:true,fit:true,toolbar:'#toolbar',fitColumns:true">
			<thead>
				<tr>
					<th data-options="field:'ck',checkbox:true"></th>
					<th data-options="field:'operate_column',width:80,align:'center',formatter:formatOperateColumn">操作</th>
					<th data-options="field:'empId',width:80,align:'center'">ID</th>
					<th data-options="field:'empCode',width:80,align:'center'">编号</th>
					<th data-options="field:'empAccount',width:80,align:'center'">账号</th>
					<th data-options="field:'empName',width:80,align:'center'">姓名</th>
					<th data-options="field:'empPassword',width:80,align:'center'">密码</th>
					<th data-options="field:'empSex',width:80,align:'center'">性别</th>
					<th data-options="field:'empBirthday',width:80,align:'center',formatter:formatDate" >生日</th>
					<th data-options="field:'empLiveAddress',width:80,align:'center'">现居地</th>
					<th data-options="field:'empWorkAddress',width:80,align:'center'">工作地点</th>
					<th data-options="field:'empPhone',width:80,align:'center'">联系方式</th>
					<th data-options="field:'empWorktime',width:80,align:'center',formatter:formatDate">入职时间</th>
					<th data-options="field:'empSalary',width:80,align:'center'">月薪</th>
					<th data-options="field:'empEmail',width:80,align:'center'">邮箱</th>
					<th data-options="field:'empIdcard',width:80,align:'center'">身份证号</th>
					<th data-options="field:'empBankcode',width:80,align:'center'">银行卡号</th>
					<!--<th data-options="field:'empWorkStatus',width:80,align:'center'">在职情况</th>-->
					<!--<th data-options="field:'empMarryStatus',width:80,align:'center'">婚姻状况</th>-->
					<th data-options="field:'workOptionLabel',width:80,align:'center'">在职情况</th>
					<th data-options="field:'marryOptionLabel',width:80,align:'center'">婚姻状况</th>
				</tr>
			</thead>
		</table>
</body>
</html>