<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/index_bootstrap.css" rel='stylesheet' type='text/css'/>
<link href="css/index_style.css" rel="stylesheet" type="text/css" media="all"/>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="js/jquery.min.js"></script>
<link href='https://fonts.googleapis.com/css?family=Amaranth:400,700,700italic,400italic' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Signika+Negative:300,400,600,700|Amaranth:400,700,700italic,400italic' rel='stylesheet' type='text/css'>
</head>
<body>
		<!--header starts-->
<div class="header">
	 <div class="container">
	     <div class="top-header">
			 <div class="logo">
				 	<a href="index.html"><img src="images/logo.png" alt="" /></a>
			 </div>
			 <div class="top-menu">
				<span class="menu"> </span>
				<ul>
					 <li class="active"><span class="pic1"></span><a href="index.html">主页</a></li>
					 <li><span class="pic2"></span><a href="http://localhost:8080/static/Login.html">注册/登录</a></li>
					 <li><span class="pic3"></span><a href="#">使用说明</a></li>
					 <li><span class="pic4"></span><a href="http://localhost:8080/static/404/error.html">关于我们</a></li>
						<div class="clearfix"></div>
				 </ul>
				  <!--script-nav-->
				 <script>
				 $("span.menu").click(function(){
				 $(".top-menu ul").slideToggle("slow" , function(){
				 });
				 });
				 </script>
				 <!--script-nav-->
			 </div>
			 <div class="clearfix"></div>
		  </div>
	 </div>
	      <div class="header-banner">
		     <script src="js/responsiveslides.min.js"></script>
		     <script>
			 $(function () {
			  $("#slider").responsiveSlides({
				auto: true,
				nav: true,
				speed: 500,
				namespace: "callbacks",
				pager: true,
			  });
			 });
			 </script>
			  <div class="container2">
				 <div class="slider">
				     <div class="callbacks_container">
						 <ul class="rslides" id="slider">
						 <li>
							<div class="sale-box">
							<span class="on_sale title_shop">NEW</span>
							</div>
						  <img src="images/1.jpg" alt="">
						  <div class="caption">
						<%--	<h1>6万家</h1>
							<p>							
								合作商户，遍历全球</p>	         --%>
						  </div>
						   </li>
						 <li>
						 <div class="sale-box">
							<span class="on_sale title_shop">NEW</span>
							</div>
						  <img src="images/2.jpg" alt="">
							 <div class="caption">
							<%--	<h1>小龙坎</h1>
								<p>Xiaolongkan</p>	  --%>
							 </div>
						 </li>
						 <li>
						 <div class="sale-box">
							<span class="on_sale title_shop">NEW</span>
							</div>
						  <img src="images/3.jpg" alt="">
						  <div class="caption">
						<%--	<h1>神户牛排</h1>
							<p>Shenhuniupai</p>	            	--%>
						  </div>
						 </li>
						  </ul>
							</div>
					 </div>
			     </div>	
			 </div>	
</div>
<!--header ends-->
<div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title=""></a></div>
<div class="container">
	 <div class="banner-content">
	 <p><span>项目产品任务管理系统, </span>覆盖需求,规划,开发任务,bug跟踪和测试管理全过程,进度可视化,支持多种开发方法,报表丰富,配置灵活,轻松管控进度,风险,成本,质量,20年专业品牌值得您信赖.</p>
	 </div>
</div>
</body>
</html>