<%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World!!!</h1>
	<%
		int i = 0;
		while(true){
			i++;
			out.println("2 x " + i + " = " + (2*i));
	%>
	<br/>
	<%
			if(i>=9) break;
		}
	%>
	
	
	
</body>
</html>