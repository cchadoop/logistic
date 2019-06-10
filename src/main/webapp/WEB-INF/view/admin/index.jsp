<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/view/admin/include/global.java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
	<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>
<title>物流后台管理界面</title>
	<style type="text/css">
		.menu.main {
			width: 100%;
			margin-left: -8px;
			border-style: none;
			/*  padding: 0px; */
		}
		
		.menu.main li {
			padding-left: 16px;
			list-style: none;
			width: 100%;
			height: 40px;
			line-height: 40px;
			border-bottom: 1px solid #e1e1e8;
		}
	</style>

	<script>

		var index = 0;

		function addTab(obj) {
			index++;
			$('#tabs').tabs('add', {
				title: obj.attr('tab-title'),
				//content:'<div style="height:1000px">a</div>',
				content: '<iframe name="indextab" scrolling="auto" src="' + obj.attr('href') + '" frameborder="0" style="width:100%;height:99%;"></iframe>',
				closable: true
			});
		}

		function removePanel() {
			var tab = $('#tabs').tabs('getSelected');
			if(tab) {
				var index = $('#tabs').tabs('getTabIndex', tab);
				$('#tabs').tabs('close', index);
			}
		}

		$(function() {
			$('.menu li').click(function() {
				addTab($(this));
			});
		});
	</script>
</head>
<body class="easyui-layout">
		<div data-options="region:'north',border:false" style="height:30px;background:#ccc;padding:6px;">
			<div style="float: right;">
			欢迎您，<span class="dl-log-user">${employee.empName }</span> <span class="admin">（管理员）</span>
			<a href="logout" title="退出系统" class="dl-log-quit">[退出]</a>
			</div>
		</div>
		<div data-options="region:'west',split:true,title:'物流系统'" style="width:150px;">
			<div class="easyui-accordion" data-options="fit:true,border:false">
				<div title="系统管理" data-options="selected:true" style="padding:0px;">
					<ul class="menu main">
						<li tab-title='客户管理' href='/admin/sys/custom/page'>客户管理</li>
						<li tab-title='员工管理' href='/admin/sys/employee/page'>员工管理</li>
						<li tab-title='角色管理' href='/admin/sys/role/page'>角色管理</li>
						<li tab-title='菜单管理' href='/admin/sys/power/page'>菜单管理</li>
						<li tab-title='模块管理' href='/admin/sys/module/page'>模块管理</li>
						<li tab-title='员工角色管理' href='/admin/sys/employeeRole/page'>员工角色管理</li>
						<li tab-title='角色菜单管理' href='/admin/sys/rolePower/page'>角色菜单管理</li>
					</ul>
				</div>
				<div title="订单管理" style="padding:0px;">
					<ul class="menu main">
						<li tab-title='订单管理' href='/admin/order/order/page'>订单管理</li>
						<li tab-title='订单详情管理' href='/admin/order/orderdetail/page'>订单详情管理</li>
						<li tab-title='供应商管理' href='/admin/order/suppiler/page'>供应商管理</li>
					</ul>
				</div>
				<div title="运输管理" style="padding:10px">
					<ul class="menu main">
						<li tab-title='车辆管理' href='/admin/transport/car/page'>车辆管理</li>
						<li tab-title='车辆类型管理' href='/admin/transport/cartype/page'>车辆类型管理</li>
						<li tab-title='司机管理' href='/admin/transport/driver/page'>司机管理</li>
						<li tab-title='路线管理' href='/admin/transport/line/page'>路线管理</li>
						<li tab-title='路线详情管理' href='/admin/transport/linedetail/page'>路线详情管理</li>
						<li tab-title='城市管理' href='/admin/transport/city/page'>城市管理</li>
						<li tab-title='省份管理' href='/admin/transport/province/page'>省份管理</li>
					</ul>  
				</div>
				<div title="配送管理" style="padding:10px">
					<ul class="menu main">
						<li tab-title='配送点管理' href='/admin/delivery/deliveryspot/page'>配送点管理</li>
						<li tab-title='交接单管理' href='/admin/delivery/handler/page'>交接单管理</li>
					</ul>
				</div>
				<div title="仓库管理" style="padding:10px">
					<ul class="menu main">
						<li tab-title='仓库管理' href='/admin/stock/stock/page'>仓库管理</li>
						<li tab-title='收货作业管理' href='/admin/stock/receive/page'>收货作业管理</li>
					</ul>
				</div>
				<div title="数据字典" style="padding:10px">
					<ul class="menu main">
						<li tab-title='数据字典管理' href='/admin/data/dataDictionary/page'>数据字典管理</li>
						<li tab-title='数据字典明细管理' href='/admin/data/dataDictionaryDetail/page'>数据字典明细管理</li>
					</ul>  
				</div>
			</div>

		</div>
		<!-- <div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">east region</div> -->
		<div data-options="region:'south',border:false" style="height:30px;background:white;padding:6px;text-align: center;">&copy; 2019 Admin Manager . All Rights Reserved | Design by CC</div>
		<div data-options="region:'center'">

			<div id="tabs" class="easyui-tabs" fit="true" border="false">
				<div title="欢迎使用" style="padding: 20px; overflow: hidden;" id="home">
					<h1>Welcome to jQuery UI!</h1>
				</div>
			</div>
		</div>
	</body>
</html>