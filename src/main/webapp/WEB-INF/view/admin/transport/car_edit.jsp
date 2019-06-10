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
<title>车辆新增|修改</title>
<script type="text/javascript">
	//图片上传
	/* function uploadImg(){
		if($('#file').val()!=""){
			$.ajaxFileUpload({
				type:"post",
				url:"uploadFile",
				dataType:"json",
				fileElementId:"file",
				success:function(data){
					if(data==''){
						alert("上传成功");
					}
				},
				error:function(){
					alert("上传失败");
				}
			});
		}else{
			alert("请选择文件");
		}
	} */
	

	$(function(){
		
		/*$('#onclickSave').on('click',function(){
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
		}); */
		
		$('#onclickSave').on('click',function(){
			var form = document.querySelector("#formEdit");
			var formData = new FormData(form);
			$.ajax({
				type:'post' ,
				url:'saveAj',
				data:formData,
				contentType:false,
				processData:false,
				dataType:"json",
				success:function(data){
					if(data.code == 0){
						window.location.href = 'page' ;
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
	    <form id="formEdit" enctype="multipart/form-data">
	    	<ul class="form_layout">

	    		<li style="display: none;">
	    			<span>ID</span>
	    			
	    			<input class="easyui-textbox"  id="carId" name="carId" value="${car.carId }"/>
	    		</li>
	    		<li>
	    			<span>编号</span>
	    			
	    			<input class="easyui-textbox"  id="carNo" name="carNo" value="${car.carNo }"/>
	    		</li>
	    		<li>
	    			<span>车辆类型</span>
	    			
	    			<select class="easyui-combobox"  id="cartypeId" name="cartypeId" value="${car.cartypeId }" style="width: 130px;"/>
	    				<c:forEach items="${listCartype}" var="cartype">
						<option value="${cartype.cartypeId}" <c:if test="${car.cartypeId==cartype.cartypeId }">selected="selected"</c:if>>${cartype.cartypeName }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>吨位(t)</span>
	    			
	    			<input class="easyui-numberbox"  id="tonnage" name="tonnage" value="${car.tonnage }" />
	    		</li>
	    		<li>
	    			<input class="easyui-filebox" onchange="ajaxFileUpload();" accept="image/*" id="imageCar" name="file" value="${car.image }" data-options="prompt:'选择图片'" style="width:90%;" />
	    		</li>
	    		<li>
	    			<img src="" alt=""/>
	    		</li>
	    		<li>
	    			<span>购买时间</span>
	    			
	    			<input class="easyui-datetimebox"  id="buyTime" name="buyTime" value="<fmt:formatDate value='${car.buyTime}' type='both' />"/>
	    		</li>
	    		<li>
	    			<span>发货时间</span>
	    			
	    			<input class="easyui-datetimebox"  id="leaveTime" name="leaveTime" value="<fmt:formatDate value='${car.leaveTime}' type='both' />"/>
	    		</li>
	    		<li>
	    			<span>车辆状态</span>
	    			
	    			<select class="easyui-combobox"  id="carStatus" name="carStatus" value="${car.carStatus }" style="width: 130px;"/>
	    				<option value="">----请选择----</option>
	    				<c:forEach items="${listCarStatus}" var="dataDictionaryDetail">
						<option value="${dataDictionaryDetail.dictionaryDetailLabel}" <c:if test="${car.carStatus==dataDictionaryDetail.dictionaryDetailLabel }">selected="selected"</c:if>>${dataDictionaryDetail.optionLabel }</option>
					</c:forEach>
	    			
	    			</select>
	    		</li>
	    		<li>
	    			<span>路线编号</span>
	    			
	    			<select class="easyui-combobox"  id="lineId" name="lineId" value="${car.lineId }" style="width:130px;"/>
	    			<c:forEach items="${listLine}" var="line">
						<option value="${line.lineId}" <c:if test="${car.lineId==line.lineId }">selected="selected"</c:if>>${line.lineNo }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>司机编号</span>
	    			
	    			<select class="easyui-combobox"  id="driverId" name="driverId" value="${car.driverId }" style="width:130px;"/>
	    			<c:forEach items="${listDriver}" var="driver">
						<option value="${driver.driverId}" <c:if test="${car.driverId==driver.driverId }">selected="selected"</c:if>>${driver.driverName }</option>
					</c:forEach>
	    			</select>
	    		</li>
	    		<li>
	    			<span>所属公司</span>
	    			
	    			<input class="easyui-textbox"  id="company" name="company" value="${car.company }"/>
	    		</li>
	    		<li>
	    			<span>备注</span>
	    			
	    			<input class="easyui-textbox"  id="remark" name="remark" value="${car.remark }"/>
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