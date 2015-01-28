<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	
	
	<div class="row">
		使用struts
		<form action="Login.action" method="post">
			<p>请输入您的姓名<input type="text" name="username"></p>
			<p><input type="submit" value="提交"></p>
		</form>
	</div>
	
</body>
</html>