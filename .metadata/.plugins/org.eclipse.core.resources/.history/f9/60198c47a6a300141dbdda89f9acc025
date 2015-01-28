<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:useBean id="book" class="com.wgh.Book"></jsp:useBean>
<jsp:setProperty property="*" name="book"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'AddBook.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
			try{
					Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost:3306/test";
					String username = "root";
					String password = "12345";
					Connection conn = DriverManager.getConnection(url,username,password);
					if(conn != null){
						out.println("数据库连接成功");
						//conn.close();
					}else{
						out.println("数据库连接失败");
					}
					//添加图书信息的SQL语句
					String sql = "insert into tb_books(name,price,bookCount,author) values(?,?,?,?)";
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ps.setString(1,book.getName());
					ps.setDouble(2,book.getPrice());
					ps.setInt(3,book.getBookCount());
					ps.setString(4,book.getAuthor());
					int row = ps.executeUpdate();
					if(row>0){
						out.print("成功添加"+row+"条数据");
					}
					ps.close();
					conn.close();
				}catch (ClassNotFoundException e){
					e.printStackTrace();
				}catch(SQLException e){
					out.print("图书信息添加失败！");
					e.printStackTrace();
				}

 %>
 <a href="index.jsp">返回</a>
  </body>
</html>
