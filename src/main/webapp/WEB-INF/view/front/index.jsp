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
<script type="text/javascript">
	function search(){
		var orderNo = $('#orderNo').val();
		if(orderNo==''){
			alert("订单号不能为空");
		}else{
			$('#formSearch').submit();
		}
	}

</script>
<title>首页</title>
</head>
<body>
<div id="container">
  <div id="banner"> </div>
  <div id="globallink">
		 <ul>
		 	<li></li>
		 	<li></li>
			<li><a href="/front/index">首页</a></li>
            <li><a href="/front/about">关于我们</a></li>
            <li><a href="/front/news">公司新闻</a></li>
            <li><a href="/front/websit">网点查询</a></li>
            <li><a href="/front/userServer">客户服务</a></li>
            <li><a href="/front/recruit">招聘信息</a></li>
            <c:if test="${custom==null }"><li><a href="/front/login">登录/注册</a></li></c:if>
            <c:if test="${custom!=null }">
            		<li>
            			<a href="#"><span style="color: #666;font-size: 12px;">${custom.cstName }</span></a>
            		</li>
            		<li>
            			<a href="/front/close"><span style="color: #666;font-size: 12px;">注销</span></a>
            		</li>
            	</c:if>
         </ul>
   </div>
   <div id="left">
   <div id="search">
   <img src="${ctx }/frontres/images/search.gif" /><br>
   请输入您要查询的<span class="STYLE1">订单号</span>：&nbsp;&nbsp;&nbsp;<br>
   <form action="/front/search" method="post" id="formSearch" name="f1">
   <input type="text" name="orderNo" id="orderNo" placeholder="请输入..."/><br>
   <img src="${ctx }/frontres/images/search.jpg" border="0" onclick="search();"/>
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
  <div id="dongtai">
    <ul>
      <li><a href="#">抓紧时间  认真贯彻  规范市场  科学发展<img src="${ctx }/frontres/images/new.gif" border="0"/></a></li>
      <li><a href="#">省管局辛局长深入会员单位GLOBAL物流司调研检查工作<img src="${ctx }/frontres/images/new.gif" border="0"/></a></li>
      <li><a href="#">公司在杭州召开2008年GLOBAL物流快递网络工作会议</a></li>
      <li><a href="#">《GLOBAL人简报》第39期全文</a></li>
      <li><a href="#">GLOBAL物流公司律师郑重声明</a></li>
      <li><a href="#">国家邮政局市场监管司安全监督处处长王永利来我公司检</a></li>
      <li><a href="#">《GLOBAL人简报》第38期全文</a></li>
    </ul>
   </div>
   <div id="title2">
     &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="#"> <img src="${ctx }/frontres/images/more.gif" align="right" border="0"/></a>
   </div>
  <div id="news">
    <ul>
      <li><a href="#">上海市部分快递企业代表学习《邮政法》（修订草案）<img src="${ctx }/frontres/images/new.gif" border="0"/></a></li>
      <li><a href="#">两岸&ldquo;大三通&rdquo;将迎来快递无限商机<img src="${ctx }/frontres/images/new.gif" border="0"/></a></li>
      <li><a href="#">上海邮政业迎世博600天行动动员大会召开</a></li>
      <li><a href="#">国家邮政局启动《快递服务》标准达标工作</a></li>
      <li><a href="#">快递业等级评定制度将出台</a></li>
      <li><a href="#">上半年我国主要城市网购市场规模达162亿元</a></li>
      <li><a href="#">奥运圣火上海传递圆满结束 结束现场进行募捐赈灾</a></li>
    </ul>
   </div>
  </div>
   <div id="right">
     <div id="notice">
     &nbsp;<br/>
     <marquee direction="up" behavior="scroll" loop="-1"  scrollamount="3" height="200" width="138">
    上海市部分快递企业代表学习<br />
    上海邮政业迎世博600天行动动员大会召开<br/>
    快递业等级评定制度将<br/>
    上海市部分快递企业代表学习<br />
    上海邮政业迎世博600天行动动员大会召开<br/>
    快递业等级评定制度将<br/>
    </marquee>
     </div>
     <div id="web">
      &nbsp;<br>
      <img src="${ctx }/frontres/images/4.gif" /><br>
       &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="/front/placeOrder"><img src="${ctx }/frontres/images/in.jpg" border="0" onclick=""/></a>
     </div>
      <hr>
      <div id="price">
       &nbsp;<br>
      <img src="${ctx }/frontres/images/3.gif" /><br>
       &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="/front/searchPrice"><img src="${ctx }/frontres/images/in.jpg" border="0" onclick=""/></a>
     </div>
  </div>
<div id="foot">
    <div id="map">
       <img src="${ctx }/frontres/images/map.gif" width="180" height="140"/>
    </div>
    <div id="map_right">
    
      <div id="website">
         <ul>
           <li><a href="#">北京市网点</a></li>
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
           <li><a href="/front/websitSearch?provinceName=广东">广东省网点</a></li>
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