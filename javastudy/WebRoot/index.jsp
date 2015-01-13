<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<jsp:useBean id="userBean" class="com.wgh.UserBean"></jsp:useBean>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<!-- Latest compiled and minified CSS & JS -->
	<link rel="stylesheet" media="screen" href="css/bootstrap.min.css">
	<link rel="stylesheet" media="screen" href="css/bootstrap-responsive.min.css">
	<script src="js/jquery-2.1.0.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-default" role="navigation">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">NW-BLOG</a>
		</div>
	
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">首页</a></li>
				<li><a href="login.html">新鲜事</a></li>
			</ul>
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="看看有什么好玩的">
				</div>
				<button type="submit" class="btn btn-default">搜索</button>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="login.html">WWD</a></li>
				<!--
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li><a href="#">Separated link</a></li>
					</ul>
				</li>
			    -->
			</ul>
		</div><!-- /.navbar-collapse -->
		
	</nav>
	<div class="container">
		<div class="row">
			测试javabean:
			<jsp:getProperty property="name" name="userBean"/>
			<jsp:getProperty property="password" name="userBean"/>
			
			<jsp:setProperty property="shuxueNum" name="userBean" value="1"/>
			<jsp:setProperty property="yingyuNum" name="userBean" value="1"/>
			<jsp:getProperty property="zongfen" name="userBean"/>
		</div>
	</div>
</body>
</html>