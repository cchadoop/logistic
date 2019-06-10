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
<title>路线详情新增|修改</title>
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
	<div class="easyui-panel" data-options="fit:true,border:false"; title="车辆新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="linedetailId" name="linedetailId" value="${linedetail.linedetailId }"/>
	    		</li>
	    		<li>
	    			<span>路线编号</span>
	    			
	    			<select class="easyui-combobox"  id="lineId" name="lineId" value="${linedetail.lineId }" style="width: 130px;"/>
	    				<c:forEach items="${listLine}" var="line">
						<option value="${line.lineId}" <c:if test="${linedetail.lineId==line.lineId }">selected="selected"</c:if>>${line.lineNo }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>配送点编号</span>
	    			
	    			<select class="easyui-combobox"  id="deliveryspotId" name="deliveryspotId" value="${linedetail.deliveryspotId }" style="width: 130px;"/>
	    			<c:forEach items="${listDeliveryspot}" var="deliveryspot">
						<option value="${deliveryspot.deliveryspotId}" <c:if test="${linedetail.deliveryspotId==deliveryspot.deliveryspotId }">selected="selected"</c:if>>${deliveryspot.deliveryspotNo }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>节点索引</span>
	    			
	    			<input class="easyui-numberbox"  id="lineIndex" name="lineIndex" data-options="precision:0" value="${linedetail.lineIndex }"/>
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