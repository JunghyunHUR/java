<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	double num = Math.random();
	if(num >= 0.95){
%>
	<h1>축하합니다. 당첨되었습니다(<%= num %>)</h1>
<%
	}else{
%>
	<h1>실패입니다. 다시 도전하세요. (<%= num %>)</h1>
<% 
		}
%>
<a href="<%= request.getRequestURI() %>"> 다시도전</a>

</body>
</html>