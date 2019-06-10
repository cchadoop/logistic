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
<title>仓库新增|修改</title>
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
	<div class="easyui-panel" data-options="fit:true,border:false"; title="仓库新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="stockId" name="stockId" value="${stock.stockId }"/>
	    		</li>
	    		<li>
	    			<span>编号</span>
	    			
	    			<input class="easyui-textbox"  id="stockNo" name="stockNo" value="${stock.stockNo }"/>
	    		</li>
	    		<li>
	    			<span>名称</span>
	    			
	    			<input class="easyui-textbox"  id="stockName" name="stockName" value="${stock.stockName }"/>
	    		</li>
	    		<li>
	    			<span>地址</span>
	    			
	    			<input class="easyui-textbox"  id="stockAddr" name="stockAddr" value="${stock.stockAddr }"/>
	    		</li>
	    		<li>
	    			<span>客户编号</span>
	    			
	    			<select class="easyui-combobox"  id="cstId" name="cstId" value="${stock.cstId }" style="width: 130px;"/>
	    				<c:forEach items="${listCustom}" var="custom">
						<option value="${custom.cstId}" <c:if test="${stock.cstId==custom.cstId }">selected="selected"</c:if>>${custom.cstName }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>订单编号</span>
	    			
	    			<select class="easyui-combobox"  id="orderId" name="orderId" value="${stock.orderId }" style="width: 130px;"/>
	    				<c:forEach items="${listOrder}" var="order">
						<option value="${order.orderId}" <c:if test="${stock.orderId==order.orderId }">selected="selected"</c:if>>${order.orderNo }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>收货单号</span>
	    			
	    			<select class="easyui-combobox"  id="receiveId" name="receiveId" value="${stock.receiveId }" style="width: 130px;"/>
	    				<c:forEach items="${listReceive}" var="receive">
						<option value="${receive.receiveId}" <c:if test="${stock.receiveId==receive.receiveId }">selected="selected"</c:if>>${receive.receiveNo }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>入库时间</span>
	    			
	    			<input class="easyui-datetimebox"  id="instockTime" name="instockTime" value="<fmt:formatDate value='${stock.instockTime}' type='both' />"/>
	    		</li>
	    		<li>
	    			<span>库位</span>
	    			
	    			<input class="easyui-textbox"  id="position" name="position" value="${stock.position }"/>
	    		</li>
	    		<li>
	    			<span>件数</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:0"  id="pkgs" name="pkgs" value="${stock.pkgs }"/>
	    		</li>
	    		<li>
	    			<span>重量(kg)</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:2"  id="weight" name="weight" value="${stock.weight }"/>
	    		</li>
	    		<li>
	    			<span>卡板体积(m³)</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:0" id="cbm" name="cbm" value="${stock.cbm }"/>
	    		</li>
	    		<li>
	    			<span>卡板长(cm)</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:0" id="l" name="l" value="${stock.l }"/>
	    		</li>
	    		<li>
	    			<span>卡板宽(cm)</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:0" id="w" name="w" value="${stock.w }"/>
	    		</li>
	    		<li>
	    			<span>卡板高(cm)</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:0" id="h" name="h" value="${stock.h }"/>
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