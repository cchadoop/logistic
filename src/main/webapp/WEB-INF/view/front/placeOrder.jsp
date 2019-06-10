<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${ctx }/frontres/css/wuliu.css"/>
<script type="text/javascript" src="${ctx }/frontres/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctx }/frontres/js/jquery.serializejson.js"></script>
<script type="text/javascript">
	function submitBtn(){
		$.ajax({
			url:"/front/placeOrderSuccess",
			type:"post",
			data:$('#formSubmit').serialize(),
			success:function(data){
				
			},
			error:function(data){
				
			}
		});
	}

</script>
<title>网上下单</title>
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
  <h2>网上下单 </h2>
  <form  name="form1" id="formSubmit"  action="/front/index">
    <table border="1" >
      <tr>
        <td colspan="2" align="center"> 寄件人详细信息 </td>
        <td colspan="2" align="center"> 收件人详细信息 </td>
      </tr>
      <tr>
        <td> 姓名 </td>
        <td><input type="text" name="sendName" />
        </td>
        <td> 姓名 </td>
        <td><input type="text" name="receiveName" />
        </td>
      </tr>
      <tr>
        <td> 地址 </td>
        <td><input type="text" name="sendAddr" />
        </td>
        <td> 地址 </td>
        <td><input type="text" name="receiveAddr" />
        </td>
      </tr>
      <tr>
        <td> 联系电话 </td>
        <td><input type="text" name="sendTel" />
        </td>
        <td> 联系电话 </td>
        <td><input type="text" name="receiveTel" />
        </td>
      </tr>
      <tr>
        <td> 邮编 </td>
        <td><input type="text" name="sendAddrCode"/>
        </td>
        <td> 邮编 </td>
        <td><input type="text" name="receiveAddrCode" />
        </td>
      </tr>
      <tr>
        <td colspan="4" align="center"> 货物信息 </td>
      </tr>
      <tr>
        <td> 名称 </td>
        <td><input type="text" name="goodsName" />
        </td>
        <td> 重量（kg） </td>
        <td><input type="text" name="weight" />
        </td>
      </tr>
      <tr>
        <td> 体积（m3） </td>
        <td><input type="text" name="volume"/>
        </td>
        <td> 总费用 </td>
        <td><input type="text" name="totalPrice" />
        </td>
      </tr>
      <tr>
        <td> 数量 </td>
        <td><input type="text" name="number"/>
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center"><input type="button" value=" 提   交 " onclick="submitBtn();"></td>
        <td colspan="2" align="center"><input type="reset" value=" 重   填 "></td>
      </tr>
    </table>
  </form>
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
       &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="webDingdan.html"><img src="${ctx}/frontres/images/in.jpg" border="0" onclick=""/></a>
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