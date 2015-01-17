<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@page import="java.util.List" %>
<%@page import="com.wgh.UserBean" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userJsp.jsp' starting page</title>
    
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
    <table class="table">
    	<tr>
    		<td>用户名</td>
			<td>密码</td>
			<td>数学成绩</td>
			<td>英语成绩</td>
			<td>总分</td>
    	</tr>
    	
    	<tr>
    		<td>用户名</td>
			<td>密码</td>
			<td>数学成绩</td>
			<td>英语成绩</td>
			<td>总分</td>
    	</tr>
    	<%
    		List<UserBean> list = (List<UserBean>)application.getAttribute("users");
    		if(list != null){
    			for(UserBean user : list){
    	%>
    		<tr>
    			<td><%=user.getName() %></td>
				<td><%=user.getPassword() %></td>
				<td></td>
				<td></td>
				<td></td>
    		</tr>
    	<% 	
    		
    			}
    		}
    	 %>
    	
    </table>
  </body>
</html>
