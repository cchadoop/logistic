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
<title>员工新增|修改</title>
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
					}
					
				}
			});
		});
	});
</script>
</head>
<body style="margin: 0;">

	
	<div class="easyui-panel" data-options="fit:true,border:false"; title="员工新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
		
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="empId" name="empId" value="${employee.empId }"/>
	    		</li>
	    		<li>
	    			<span>编号</span>
	    			
	    			<input class="easyui-textbox"  id="empCode" name="empCode" value="${employee.empCode }"/>
	    		</li>
	    		<li>
	    			<span>账号</span>
	    			
	    			<input class="easyui-textbox"  id="empAccount" name="empAccount" value="${employee.empAccount }"/>
	    		</li>
	    		<li>
	    			<span>姓名</span>
	    			
	    			<input class="easyui-textbox"  id="empName" name="empName" value="${employee.empName }"/>
	    		</li>
	    		
	    		<li>
	    			<span>密码</span>
	    			
	    			<input class="easyui-passwordbox"  id="empPassword" name="empPassword" value="${employee.empPassword }"/>
	    		</li>
	    		
	    		<li>
	    			<span>性别</span>
	    			
	    			<select class="easyui-combobox"  id="empSex" name="empSex" value="${employee.empSex }" style="width:130px;"/>
					<option value="">----请选择----</option>	    				
	    				<option value="男">男</option>
	    				<option value="女">女</option>
	    			</select>
	    		</li>
	    		<li>
	    			<span>生日</span>
	    			
	    			<input class="easyui-datebox"  id="empBirthday" name="empBirthday"  value="<fmt:formatDate value='${employee.empBirthday}' type='date' pattern='yyyy-MM-dd'/>"/>
	    		</li>
	    		<li>
	    			<span>现居地</span>
	    			
	    			<input class="easyui-textbox"  id="empLiveAddress" name="empLiveAddress" value="${employee.empLiveAddress }"/>
	    		</li>
	    		
	    		<li>
	    			<span>工作地点</span>
	    			
	    			<input class="easyui-textbox"  id="empWorkAddress" name="empWorkAddress" value="${employee.empWorkAddress }"/>
	    		</li>
	    		<li>
	    			<span>联系方式</span>
	    			
	    			<input class="easyui-numberbox" id="empPhone" name="empPhone" value="${employee.empPhone }"/>
	    		</li>
	    		<li>
	    			<span>入职时间</span>
	    			
	    			<input class="easyui-datebox" id="empWorktime" name="empWorktime" value="<fmt:formatDate value='${employee.empWorktime}' type='date' pattern='yyyy-MM-dd'/>" />
	    		</li>
	    		<li>
	    			<span>月薪</span>
	    			
	    			<input class="easyui-numberbox" id="empSalary" name="empSalary" value="${employee.empSalary }"  />
	    		</li>
	    		<li>
	    			<span>邮箱</span>
	    			
	    			<input class="easyui-textbox validatebox" id="empEmail" name="empEmail" value="${employee.empEmail }" data-options="prompt:'Enter a valid email.',required:false,validType:'email'"  />
	    		</li>
	    		<li>
	    			<span>身份证号</span>
	    			
	    			<input class="easyui-numberbox" id="empIdcard" name="empIdcard" value="${employee.empIdcard }" />
	    		</li>
	    		<li>
	    			<span>银行卡号</span>
	    			
	    			<input class="easyui-numberbox" id="empBankcode" name="empBankcode" value="${employee.empBankcode }" />
	    		</li>

	    		<li>
	    			<span>在职状况</span>
	    			
	    			<select class="easyui-combobox"  id="empWorkStatus" name="empWorkStatus" value="${employee.empWorkStatus }" style="width:130px;"/>
	    				<option value="">----请选择----</option>
		    			<c:forEach items="${listEmpWorkStatus }" var="dataDictionaryDetail">
		    				<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${employee.empWorkStatus==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
		    			</c:forEach>
	    			</select>
	    		</li>

	    		<li>
	    			<span>婚姻状况</span>
	    			
	    			<select class="easyui-combobox"  id="empMarryStatus" name="empMarryStatus" value="${employee.empMarryStatus }"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listEmpMarryStatus }" var="dataDictionaryDetail">
		    				<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${employee.empMarryStatus==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
		    			</c:forEach>
	    			</select>
	    		</li>
	    	</ul>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" id="onclickSave">保存</a>
	    	<!-- <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">关闭</a> -->
	    </div>
	    </div>
	</div>
	</body>
</html>