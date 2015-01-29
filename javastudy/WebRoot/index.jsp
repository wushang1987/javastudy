<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="com.wgh.Book" %>
<jsp:useBean id="userBean" class="com.wgh.UserBean"></jsp:useBean>
<jsp:useBean id="batch" class="com.wgh.Batch"></jsp:useBean>
<%
	//执行批量插入操作
	int row = batch.saveBatch();
//	out.print("批量插入了"+row+"条数据");
 %>
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
			<table class="table">
				<tr>
					<td>用户名</td>
					<td>密码</td>
					<td>数学成绩</td>
					<td>英语成绩</td>
					<td>总分</td>
				</tr>
					<td><jsp:getProperty property="name" name="userBean"/></td>
					<td><jsp:getProperty property="password" name="userBean"/></td>
					<td><jsp:setProperty property="shuxueNum" name="userBean" value="0"/>1</td>
					<td><jsp:setProperty property="yingyuNum" name="userBean" value="1"/>1</td>
					<td><jsp:getProperty property="zongfen" name="userBean"/></td>
				<tr>
				</tr>
					<td>${userBean.name}</td>
					<td>${userBean.password}</td>
					<td>${userBean.shuxueNum}</td>
					<td>${userBean.yingyuNum}</td>
					<td>${userBean.zongfen}</td>
				<tr>
					
				</tr>
			</table>
		</div>
		
		<div class="row">
			<form action="MyServlet" method="post">
				<p>请输入您的姓名<input type="text" name="name"></p>
				<p><input type="submit" value="提交"></p>
			</form>
		</div>
		
		<div class="row">
			<form action="UserServlet" method="post">
				<p>请输入您的姓名<input type="text" name="name"></p>
				<p>请输入您的密码<input type="text" name="password"></p>
				<p><input type="submit" value="提交"></p>
			</form>
		</div>
		
		<div class="row">
			<div>欢迎光临，您是本站第<%=application.getAttribute("count") %>位访客</div>
		</div>
		
		<div class="row">
			<form action="AddServlet" method="post">
				<ul>
					<li>图书编号：<input type="text" name="id"></li>				
					<li>名          称：<input type="text" name="name"></li>				
					<li>作	    者：<input type="text" name="author"></li>				
					<li>价          格：<input type="text" name="price"></li>				
				</ul>
				<input type="submit" value="添加">
			</form>
		</div>
		
		<div class="row">
			<form action="UserInfoFrace" method="post">
				<input type="text" name="name">
				<input type="submit" value="提交">
			</form>
		
		</div>
		
		<div class="row">
			<%
				String[] names = {"A","B","C"};
				try{
					Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost:3306/test";
					String username = "root";
					String password = "12345";
					Connection conn = DriverManager.getConnection(url,username,password);
					if(conn != null){
						//out.println("数据库连接成功");
						//conn.close();
					}else{
						out.println("数据库连接失败");
					}
					
					Statement stmt = conn.createStatement();
					stmt.clearBatch();
					for(int i = 0;i<names.length;i++){
						stmt.addBatch("insert into tb_inf(name) values('"+names[i]+"')");
					}
					stmt.executeBatch();
					stmt.close();
					conn.close();
					out.println("批量添加成功");
				}catch (ClassNotFoundException e){
					e.printStackTrace();
				}catch(SQLException e){
					e.printStackTrace();
				}
			 %>
		</div>
		
		<div class="row">
			<form action="AddBook.jsp" method="post" >
				<h2>添加图书信息</h2>
				图书名称：<input type="text" name="name"/>
				价格：<input type="text" name="price"/>
				数量：<input type="text" name="bookCount"/>
				作者：<input type="text" name="author"/>
				<input type="submit" value="添加">
			</form>
		</div>
		<div class="row">
			<a href="FindServlet"> 查看所有图书</a>
		</div>
		
		<div class="row">
			<h3>这个地方调用的是存储过程</h3>
			<jsp:useBean id="findBook" class="com.wgh.FindBook"></jsp:useBean>
			
			<table>
  		<tr>
  			<td colspan="5">
  				<h2>所有图书信息</h2>
  			</td>
  		</tr>
  		<tr>
  			<td>ID</td>
  			<td>图书名称</td>
  			<td>价格</td>
  			<td>数量</td>
  			<td>作者</td>
  		</tr>
  			<%
  				//获取图书信息集合
  					List<Book> list = findBook.findAll();
  					if(list == null || list.size()<1){
  						out.print("没有数据");
  					}else{
  						//遍历图书集合中的数据
  						for(Book book:list){
  						
  			
  			 %>
  		<tr>
  			<td><%=book.getId() %></td>
  			<td><%=book.getName() %></td>
  			<td><%=book.getPrice() %></td>
  			<td><%=book.getBookCount() %></td>
  			<td><%=book.getAuthor() %></td>
  		</tr>
  			<%
  				}
  					}
  			 %>
  	
  	</table>
		</div>
		
		
		<div class="row">
			<a href="FindProductServlet">查看所有商品信息</a>
		</div>
		
		<div class="row">
			<a href="struts2Test/MyStruts.jsp">使用struts</a>
		</div>
	
	</div>
	
	
	
</body>
</html>