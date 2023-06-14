<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String userid, userpwd;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	userid = request.getParameter("userid");
	userpwd = request.getParameter("userpw");
%>
<h2>sub 페이지 입니다.</h2>
<div><%= userid %></div>
<div><%= userpwd %></div>
</body>
</html>