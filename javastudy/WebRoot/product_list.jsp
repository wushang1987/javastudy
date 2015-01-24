<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.wgh.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'product_list.jsp' starting page</title>
    
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
   <table>
  		<tr>
  			<td colspan="5">
  				<h2>所有图书信息</h2>
  			</td>
  		</tr>
  		<tr>
  			<td>ID</td>
  			<td>商品名称</td>
  			<td>价格</td>
  			<td>数量</td>
  			<td>单位</td>
  		</tr>
  			<%
  				//获取图书信息集合
  					//List<Book> list = (List<Book>)request.getAttribute("list");
  					List<Product> list = (List<Product>)request.getAttribute("list");
  					if(list == null || list.size()<1){
  						out.print("没有数据");
  					}else{
  						//遍历图书集合中的数据
  						for(Product p:list){
  						
  			
  			 %>
  		<tr>
  			<td><%=p.getId() %></td>
  			<td><%=p.getName() %></td>
  			<td><%=p.getPrice() %></td>
  			<td><%=p.getNum() %></td>
  			<td><%=p.getUnit() %></td>
  		</tr>
  			<%
  				}
  					}
  			 %>
  		<tr>
  			<td colspan="5">
  				<%=request.getAttribute("bar") %>
  			</td>
  		</tr>
  	
  	</table>
  </body>
</html>
