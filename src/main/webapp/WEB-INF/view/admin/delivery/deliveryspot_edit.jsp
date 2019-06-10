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
<title>配送点新增|修改</title>
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
	<div class="easyui-panel" data-options="fit:true,border:false"; title="配送点新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id="formEdit">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="deliveryspotId" name="deliveryspotId" value="${deliveryspot.deliveryspotId }"/>
	    		</li>
	    		<li>
	    			<span>编号</span>
	    			
	    			<input class="easyui-textbox"  id="deliveryspotNo" name="deliveryspotNo" value="${deliveryspot.deliveryspotNo }"/>
	    		</li>
	    		<li>
	    			<span>名称</span>
	    			
	    			<input class="easyui-textbox"  id="deliveryspotName" name="deliveryspotName" value="${deliveryspot.deliveryspotName }"/>
	    		</li>
	    		<li>
	    			<span>城市</span>
	    			
	    			<select class="easyui-combobox"  id="cityId" name="cityId" value="${deliveryspot.cityId }" style="width: 130px;"/>
	    				<c:forEach items="${listCity}" var="city">
						<option value="${city.cityId}" <c:if test="${deliveryspot.cityId==city.cityId }">selected="selected"</c:if>>${city.cityName }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>员工</span>
	    			
	    			<select class="easyui-combobox"  id="empId" name="empId" value="${deliveryspot.empId }" style="width: 130px;"/>
	    				<c:forEach items="${listEmployee}" var="employee">
						<option value="${employee.empId}" <c:if test="${deliveryspot.empId ==employee.empId }">selected="selected"</c:if>>${employee.empName }</option>
					</c:forEach>
				</select>
	    		</li>
	    		<li>
	    			<span>详细地址</span>
	    			
	    			<input class="easyui-textbox"  id="deliveryspotAddr" name="deliveryspotAddr" value="${deliveryspot.deliveryspotAddr }"/>
	    		</li>
	    		<li>
	    			<span>联系电话</span>
	    			
	    			<input class="easyui-textbox"  id="tel" name="tel" value="${deliveryspot.tel }"/>
	    		</li>
	    		<li>
	    			<span>首重量范围(kg)</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:2" id="firstWeightScope" name="firstWeightScope" value="${deliveryspot.firstWeightScope }"/>
	    		</li>
	    		<li>
	    			<span>首重量价格(元)</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:2" id="firstWeightPrice" name="firstWeightPrice" value="${deliveryspot.firstWeightPrice }"/>
	    		</li>
	    		<li>
	    			<span>次重量系数(元/kg)</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:2" id="secondWeightRate" name="secondWeightRate" value="${deliveryspot.secondWeightRate }"/>
	    		</li>
	    		<li>
	    			<span>首体积范围(m³)</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:2" id="firstVolumeScope" name="firstVolumeScope" value="${deliveryspot.firstVolumeScope }"/>
	    		</li>
	    		<li>
	    			<span>首体积价格(元)</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:2" id="firstVolumePrice" name="firstVolumePrice" value="${deliveryspot.firstVolumePrice }"/>
	    		</li>
	    		<li>
	    			<span>次体积系数(元/m³)</span>
	    			
	    			<input class="easyui-numberbox" data-options="precision:2" id="secondVolumeRate" name="secondVolumeRate" value="${deliveryspot.secondVolumeRate }"/>
	    		</li>
	    		<li>
	    			<span>配送时间</span>
	    			
	    			<input class="easyui-datetimebox"  id="deliveryTime" name="deliveryTime" value="<fmt:formatDate value='${deliveryspot.deliveryTime}' type='both' />"/>
	    		</li>
	    		<li>
	    			<span>配送状态</span>
	    			
	    			<select class="easyui-combobox"  id="deliveryStatus" name="deliveryStatus" value="${deliveryspot.deliveryStatus }" style="width: 130px;"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listDeliveryStatus}" var="dataDictionaryDetail">
						<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${deliveryspot.deliveryStatus==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
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