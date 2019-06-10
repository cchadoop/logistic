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
<title>收货作业新增|修改</title>
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
	<div class="easyui-panel" data-options="fit:true,border:false"; title="收货作业新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="receiveId" name="receiveId" value="${receive.receiveId }"/>
	    		</li>
	    		<li>
	    			<span>编号</span>
	    			
	    			<input class="easyui-textbox"  id="receiveNo" name="receiveNo" value="${receive.receiveNo }"/>
	    		</li>
	    		<li>
	    			<span>订单编号</span>
	    			
	    			<select class="easyui-combobox"  id="orderId" name="orderId" value="${receive.orderId }" style="width: 130px;"/>
	    				<!--<option value="">----请选择----</option>  -->
	    				<c:forEach items="${listOrder}" var="order">
						<option value="${order.orderId}" <c:if test="${receive.orderId==order.orderId }">selected="selected"</c:if>>${order.orderNo }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>收货人</span>
	    			
	    			<input class="easyui-textbox"  id="receivePerson" name="receivePerson" value="${receive.receivePerson }"/>
	    		</li>
	    		<li>
	    			<span>收货时间</span>
	    			
	    			<input class="easyui-datetimebox"  id="receiveTime" name="receiveTime" value="<fmt:formatDate value='${receive.receiveTime}' type='both' />"/>
	    		</li>
	    		<li>
	    			<span>收货状态</span>
	    			
	    			<select class="easyui-combobox"  id="receiveStatus" name="receiveStatus" value="${receive.receiveStatus }" style="width: 130px;"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listReceiveStatus}" var="dataDictionaryDetail">
						<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${receive.receiveStatus==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>收货方式</span>
	    			
	    			<select class="easyui-combobox"  id="receiveWay" name="receiveWay" value="${receive.receiveWay }" style="width: 130px;"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listReceiveWay}" var="dataDictionaryDetail">
						<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${receive.receiveWay==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>确认时间</span>
	    			
	    			<input class="easyui-datetimebox"  id="confirmTime" name="confirmTime" value="<fmt:formatDate value='${receive.confirmTime}' type='both' />"/>
	    		</li>
	    		<li>
	    			<span>确认地址</span>
	    			
	    			<input class="easyui-textbox"  id="confirmAddr" name="confirmAddr" value="${receive.confirmAddr }"/>
	    		</li>
	    		<li>
	    			<span>确认人</span>
	    			
	    			<input class="easyui-textbox"  id="confirmPerson" name="confirmPerson" value="${receive.confirmPerson }"/>
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