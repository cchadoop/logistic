<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${ctx }/frontres/css/wuliu.css"/>
<script type="text/javascript" src="${ctx }/frontres/js/jquery.min.js"></script>
<title>网点查询</title>
</head>
<body>
<div id="container">
  <div id="banner"> </div>
  <div id="globallink">
		 <ul>
              <li></li>
            <li></li>
            <li></li>
            <li></li>
		   <li><a href="/front/index">首页</a></li>
            <li><a href="/front/about">关于我们</a></li>
            <li><a href="/front/news">公司新闻</a></li>
            <li><a href="/front/websit">网点查询</a></li>
            <li><a href="/front/userServer">客户服务</a></li>
            <li><a href="/front/recruit">招聘信息</a></li>
         </ul>
   </div>
   <div id="left">
   <div id="search">
   <img src="${ctx}/frontres/images/search.gif" /><br>
   请输入您要查询的<span class="STYLE1">订单号</span>：&nbsp;&nbsp;&nbsp;<br>
   <form action="" method="post">
   <input type="text" name=""/><br>
   <a href="search.html"><img src="${ctx}/frontres/images/search.jpg" border="0" onclick=""/></a>
   </form>
   </div>
   <div id="photo">
    <img src="${ctx}/frontres/images/left.JPG" />
   </div>
   <div id="contact">
   <div id="lianxi">
     &nbsp;<br>
     &nbsp;<br>
     &nbsp;<span class="STYLE1">客服TEL</span>：<span class="STYLE4">0351-14125365</span><br>
     &nbsp;<span class="STYLE1">公司邮箱</span>：<span class="STYLE4">global@gmail.com </span>  </div>
  </div>
  </div>
  <div id="main">
  <center>
    	<h2>${provinceName }网点</h2>
    	
    	<table border="0" class="t1" width="400" height="120">
    		<form action="#">
    			<tr>
	    			<th>站点城市</th>
	    			<th>详细地址</th>
	    			<th>站点名称</th>
	    			<th>联系电话</th>
	    			
    			</tr>
    			<c:forEach items="${listDeliveryspot }" var="deliveryspot">
    			<tr>
    				<td align="center">${deliveryspot.cityName }</td>
    				<td align="center">${deliveryspot.deliveryspotAddr }</td>
    				<td align="center">${deliveryspot.deliveryspotName }</td>
                	<td align="center">${deliveryspot.tel }</td>
    			</tr>
    			</c:forEach>
    		</form>
   	  </table>
    </center>
  </div>
   <div id="right">
     <div id="login">
     &nbsp;&nbsp;&nbsp;&nbsp;<img src="${ctx}/frontres/images/office.jpg" /><br>
     <form action="" method="post">
     登陆名：<input type="text" name="" size="11"/><br>
     &nbsp;&nbsp;&nbsp;&nbsp;密码：<input type="password" name="" size="11"/><br>
     &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="../wuliu_office.html"><img src="${ctx}/frontres/images/login.jpg" border="0"/></a>
     </form>
     </div>
     <hr>
     <div id="web">
      &nbsp;<br>
      <img src="${ctx}/frontres/images/4.gif" /><br>
       &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <a href="webDingdan.html"><img src="${ctx}/frontres/images/in.jpg" border="0" onclick=""/></a>
     </div>
      <hr>
      <div id="price">
       &nbsp;<br>
      <img src="${ctx}/frontres/images/3.gif" /><br>
       &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="price.html"><img src="${ctx}/frontres/images/in.jpg" border="0" onclick=""/></a>
     </div>
  </div>
<div id="foot">
    <div id="map">
       <img src="${ctx}/frontres/images/map.gif" width="180" height="140"/>
    </div>
    <div id="map_right">
    
      <div id="website">
         <ul>
           <li><a href="searchWebSit.html">北京市网点</a></li>
           <li><a href="#">上海市网点</a></li>

           <li><a href="#">天津市网点</a></li>
           <li><a href="#">重庆市网点</a></li>
           <li><a href="#">浙江省网点</a></li>
         </ul>
      </div>
      <div id="website">
         <ul>
           <li><a href="#">江苏省网点</a></li>
           <li><a href="#">福建省网点</a></li>
           <li><a href="#">湖北省网点</a></li>
           <li><a href="#">湖南省网点</a></li>
           <li><a href="#">山东省网点</a></li>
         </ul>
      </div>
      <div id="website">
         <ul>
           <li><a href="#">广东省网点</a></li>
           <li><a href="#">辽宁省网点</a></li>
           <li><a href="#">江西省网点</a></li>
           <li><a href="#">河北省网点</a></li>
           <li><a href="#">安徽省网点</a></li>
         </ul>
      </div>
      <div id="website">
         <ul>
           <li><a href="#">河南省网点</a></li>
           <li><a href="#">吉林省网点</a></li>
           <li><a href="#">四川省网点</a></li>
           <li><a href="#">山西省网点</a></li>
           <li><a href="#">陕西省网点</a></li>
         </ul>
      </div>
      <div id="website">
         <ul>
           <li><a href="#">甘肃省网点</a></li>
           <li><a href="#">青海省网点</a></li>
           <li><a href="#">贵州省网点</a></li>
           <li><a href="#">云南省网点</a></li>
           <li><a href="#">海南省网点</a></li>
         </ul>
      </div>
    </div>
  </div>
</div>
</body>
</html>
