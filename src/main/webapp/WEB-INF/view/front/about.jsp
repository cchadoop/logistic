<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${ctx }/frontres/css/wuliu.css"/>
<title>关于我们</title>
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
   请输入您要查询的<span class="STYLE1">订单号</span>：&nbsp;&nbsp;&nbsp;<br>
   <form action=""method="post">
   <input type="text" name=""/><br>
   <a href="search.html"><img src="${ctx }/frontres/images/search.jpg" border="0" onclick=""/></a>
   </form>
   </div>
   <div id="photo">
    <img src="${ctx }/frontres/images/left.JPG" />
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
  <div id="title1">
     &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="#"><img src="${ctx }/frontres/images/more.gif" align="right"  border="0"/></a>
   </div>
  <div id="abaut">
 <center> <h2>GLOBAL物流集团</h2></center>
<pre>
    GLOBAL物流集团成立于1993年，注册于松江区小昆山秦安街18号小昆山
 经济区是一家以经营快递为主的国内合资（民营）企业。

　　目前公司的主要经营地处于上海市青浦区北青公路6186号。      

　　公司分别在全国各省会城市（除台湾）以及其它大中城市建立起了800多
个分公司，吸收1100余家加盟网点，全网络有员工2万多人。

　　公司注册商标为“STO＋申通”，注册编号为1379930。主要承接非信函、
样品、大小物件的速递业务。2004年3月公司通过ISO9001:2000国际质量管理体
系认证。

     公司奉行“团结、务实、开拓、创新”的企业精神，已深得广大客户的信
任和支持。

     公司在全国范围内形成了流畅的速递网络，并与港澳地区和国外大城市建
立了业务联系。
    
    公司自1993年成立以来，在董事长陈德军的正确领导下，在广大客户的支持
和关怀下，在全 体员工的艰苦奋斗和顽强拼搏下，已经成为国内速递领域最具影
响力的民营企业之一，先后荣获上海市松江区民营企业2000至2005年度的《信得
过企业》、《先进企业》荣誉称号；2005年，公司荣获《中国物流十大影响力品
牌》称号，公司董事长陈德军先生个人荣获《中国品牌建设十大杰出企业家》荣
誉称号。

    公司在全国范围内形成了流畅的速递网络，并与港澳地区和国外大城市建立
了业务联系。
     </pre>
   </div>
  </div>

   <div id="right">
     <div id="login">
     &nbsp;&nbsp;&nbsp;&nbsp;<img src="${ctx }/frontres/images/office.jpg" /><br>
     <form action="" method="post">
     登陆名：<input type="text" name="" size="11"/><br>
     &nbsp;&nbsp;&nbsp;&nbsp;密码：<input type="password" name="" size="11"/><br>
     &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="../wuliu_office.html"><img src="${ctx }/frontres/images/login.jpg" border="0"/></a>
     </form>
     </div>
     <hr>
     <div id="web">
      &nbsp;<br>
      <img src="${ctx }/frontres/images/4.gif" /><br>
       &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <a href="webDingdan.html"><img src="${ctx }/frontres/images/in.jpg" border="0" onclick=""/></a>
     </div>
      <hr>
      <div id="price">
       &nbsp;<br>
      <img src="${ctx }/frontres/images/3.gif" /><br>
       &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <a href="price.html"><img src="${ctx }/frontres/images/in.jpg" border="0" onclick=""/></a>
     </div>
  </div>
<div id="foot">
    <div id="map">
       <img src="${ctx }/frontres/images/map.gif" width="180" height="140"/>
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
