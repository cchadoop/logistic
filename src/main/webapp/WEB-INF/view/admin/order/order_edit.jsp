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
<title>订单新增|修改</title>
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
	<div class="easyui-panel" data-options="fit:true,border:false"; title="订单新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="orderId" name="orderId" value="${order.orderId }"/>
	    		</li>
	    		<li>
	    			<span>编号</span>
	    			
	    			<input class="easyui-textbox"  id="orderNo" name="orderNo" value="${order.orderNo }"/>
	    		</li>
	    		<li>
	    			<span>寄件人</span>
	    			
	    			<input class="easyui-textbox"  id="sendName" name="sendName" value="${order.sendName }"/>
	    		</li>
	    		<li>
	    			<span>寄件人地址</span>
	    			
	    			<input class="easyui-textbox"  id="sendAddr" name="sendAddr" value="${order.sendAddr }"/>
	    		</li>
	    		<li>
	    			<span>寄件人地址邮编</span>
	    			
	    			<input class="easyui-textbox"  id="sendAddrCode" name="sendAddrCode" value="${order.sendAddrCode }"/>
	    		</li>
	    		<li>
	    			<span>寄件人电话</span>
	    			
	    			<input class="easyui-textbox"  id="sendTel" name="sendTel" value="${order.sendTel }"/>
	    		</li>
	    		<li>
	    			<span>收件人</span>
	    			
	    			<input class="easyui-textbox"  id="receiveName" name="receiveName" value="${order.receiveName }"/>
	    		</li>
	    		<li>
	    			<span>收件人地址</span>
	    			
	    			<input class="easyui-textbox"  id="receiveAddr" name="receiveAddr" value="${order.receiveAddr }"/>
	    		</li>
	    		<li>
	    			<span>收件人地址邮编</span>
	    			
	    			<input class="easyui-textbox"  id="receiveAddrCode" name="receiveAddrCode" value="${order.receiveAddrCode }"/>
	    		</li>
	    		<li>
	    			<span>收件人电话</span>
	    			
	    			<input class="easyui-textbox"  id="receiveTel" name="receiveTel" value="${order.receiveTel }"/>
	    		</li>
	    		<li>
	    			<span>订单状态</span>
	    			
	    			<select class="easyui-combobox"  id="orderStatus" name="orderStatus" value="${order.orderStatus }"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listOrderStatus}" var="dataDictionaryDetail">
						<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${order.orderStatus==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>备注</span>
	    			
	    			<input class="easyui-textbox"  id="remark" name="remark" value="${order.remark }"/>
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