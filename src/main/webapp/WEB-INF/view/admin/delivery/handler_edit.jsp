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
<title>交接单新增|修改</title>
<style type="text/css">
	.form_layout>li>span{
		width:105px;
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
	<div class="easyui-panel" data-options="fit:true,border:false"; title="交接单新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="handlerId" name="handlerId" value="${handler.handlerId }"/>
	    		</li>
	    		<li>
	    			<span>编号</span>
	    			
	    			<input class="easyui-textbox"  id="handlerNo" name="handlerNo" value="${handler.handlerNo }"/>
	    		</li>
	    		<li>
	    			<span>交接人员</span>
	    			
	    			<select class="easyui-combobox"  id="empId" name="empId" value="${handler.empId }" style="width:130px;"/>
	    			<c:forEach items="${listEmployee}" var="employee">
						<option value="${employee.empId}" <c:if test="${handler.empId==employee.empId }">selected="selected"</c:if>>${employee.empName }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>订单编号</span>
	    			
	    			<select class="easyui-combobox"  id="orderId" name="orderId" value="${handler.orderId }" style="width:130px;"/>
	    			<c:forEach items="${listOrder}" var="order">
						<option value="${order.orderId}" <c:if test="${handler.orderId==order.orderId }">selected="selected"</c:if>>${order.orderNo }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>配送点编号</span>
	    			
	    			<select class="easyui-combobox"  id="deliveryspotId" name="deliveryspotId" value="${handler.deliveryspotId }" style="width:130px;"/>
	    				<c:forEach items="${listDeliveryspot}" var="deliveryspot">
						<option value="${deliveryspot.deliveryspotId}" <c:if test="${handler.deliveryspotId==deliveryspot.deliveryspotId }">selected="selected"</c:if>>${deliveryspot.deliveryspotNo }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>车辆编号</span>
	    			
	    			<select class="easyui-combobox"  id="carId" name="carId" value="${handler.carId }" style="width:130px;"/>
	    				<c:forEach items="${listCar}" var="car">
						<option value="${car.carId}" <c:if test="${handler.carId==car.carId }">selected="selected"</c:if>>${car.carNo }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>创建时间</span>
	    			
	    			<input class="easyui-datetimebox"  id="createTime" name="createTime" value="<fmt:formatDate value='${handler.createTime}' type='both' />"/>
	    		</li>
	    		<li>
	    			<span>交接状态</span>
	    			
	    			<select class="easyui-combobox"  id="handlerStatus" name="handlerStatus" value="${handler.handlerStatus }" style="width: 130px;"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listHandlerStatus}" var="dataDictionaryDetail">
						<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${handler.handlerStatus==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
					</c:forEach>
				</select>
	    		</li>
	    		<li>
	    			<span>备注</span>
	    			
	    			<input class="easyui-textbox"  id="remark" name="remark" value="${handler.remark }"/>
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