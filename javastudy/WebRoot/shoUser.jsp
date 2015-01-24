<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import = "com.wgh.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
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
    	//获得UserInfoList类的对象
    	UserInfoList list = UserInfoList.getInstance();
    	UserInfoFrace ut =new UserInfoFrace();
    	request.setCharacterEncoding("UTF-8");
    	String name = request.getParameter("user");
    	ut.setUser(name);
    	session.setAttribute("list",ut);
    	list.addUserInfo(ut.getUser());
    	session.setMaxInactiveInterval(30);
     %>
     <textarea rows="8" cols="20">
     <%
     	Vector vector = list.getList();
     	if(vector != null && vector.size()>0){
     		for(int i=0;i<vector.size();i++){
     			out.println(vector.elementAt(i));
     		}
     	}
      %>
      </textarea>
  </body>
</html>
