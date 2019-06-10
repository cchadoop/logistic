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
<title>订单详情新增|修改</title>
<style type="text/css">
	.form_layout>li>span{
		width:90px;
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
	<div class="easyui-panel" data-options="fit:true,border:false"; title="订单详情新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="orderdetailId" name="orderdetailId" value="${orderdetail.orderdetailId }"/>
	    		</li>
	    		<li>
	    			<span>订单编号</span>
	    			
	    			<select class="easyui-combobox"  id="orderId" name="orderId" value="${orderdetail.orderId }" style="width: 130px;"/>
	    				<c:forEach items="${modelMap['listOrder']}" var="order">
						<option value="${order.orderId}" <c:if test="${orderdetail.orderId==order.orderId }">selected="selected"</c:if>>${order.orderNo }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>货物名称</span>
	    			
	    			<input class="easyui-textbox"  id="goodsName" name="goodsName" value="${orderdetail.goodsName }"/>
	    		</li>
	    		<li>
	    			<span>数量（件）</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:0"  id="number" name="number" value="${orderdetail.number }"/>
	    		</li>
	    		<li>
	    			<span>体积(m³)</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:2" id="volume" name="volume" value="${orderdetail.volume }"/>
	    		</li>
	    		<li>
	    			<span>重量(kg)</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:2" id="weight" name="weight" value="${orderdetail.weight }"/>
	    		</li>
	    		<li>
	    			<span>总金额</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:1" id="totalPrice" name="totalPrice" value="${orderdetail.totalPrice }"/>
	    		</li>
	    		<li>
	    			<span>创建时间</span>
	    			
	    			<input class="easyui-datetimebox"  id="createTime" name="createTime" value="<fmt:formatDate value='${orderdetail.createTime}' type='both' />"/>
	    		</li>
	    		<li>
	    			<span>更新时间</span>
	    			
	    			<input class="easyui-datetimebox"  id="updateTime" name="updateTime" value="<fmt:formatDate value='${orderdetail.updateTime}' type='both' />"/>
	    		</li>
	    		<li>
	    			<span>配送点编号</span>
	    			
	    			<select class="easyui-combobox"  id="deliveryspotId" name="deliveryspotId" value="${orderdetail.deliveryspotId }" style="width:130px;"/>
	    			<c:forEach items="${modelMap['listDeliveryspot']}" var="deliveryspot">
						<option value="${deliveryspot.deliveryspotId}" <c:if test="${orderdetail.deliveryspotId==deliveryspot.deliveryspotId }">selected="selected"</c:if>>${deliveryspot.deliveryspotNo }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>供应商编号</span>
	    			
	    			<select class="easyui-combobox"  id="suppilerId" name="suppilerId" value="${orderdetail.suppilerId }" style="width:130px;"/>
	    				<c:forEach items="${modelMap['listSuppiler']}" var="suppiler">
						<option value="${suppiler.suppilerId}" <c:if test="${orderdetail.suppilerId==suppiler.suppilerId }">selected="selected"</c:if>>${suppiler.suppilerNo }</option>
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