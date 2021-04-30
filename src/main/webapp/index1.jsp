<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="util.*" %> <%--导入util包下的所有java文件--%>
<%@page import="java.net.*" %>
<%@page import="java.lang.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <meta charset="utf-8" />
    <script src="src/main/webapp/WEB-INF/js/jquery-3.5.1.min.js"></script>


</head>
<body>


<form action="${pageContext.request.contextPath}/getLocalIp" method="post">
    <tr><td><input type="submit"   value="提交" /></td></tr>
</form>

<form action="${pageContext.request.contextPath}/toSavePs" method="post">
    <tr><td><input type="text"  name="employees1"  value="1" /></td></tr>
    <tr><td><input type="text"  name="employees2"  value="2" /></td></tr>
    <tr><td><input type="text"  name="employees3"  value="" /></td></tr>

    <tr><td><input type="text"  name="professional1"  value="4" /></td></tr>
    <tr><td><input type="text"  name="professional2"  value="5" /></td></tr>
    <tr><td><input type="text"  name="professional3"  value="6" /></td></tr>

    <tr><td><input type="submit"  id="regist" value="提交" /></td></tr>
</form>






</body>
</html>
