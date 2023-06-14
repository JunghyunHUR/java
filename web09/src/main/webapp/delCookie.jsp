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
/*
	Cookie[] cookies = request.getCookies();
	for(int i = 0; i < cookies.length; i++){
		cookies[i].setMaxAge(0);
		response.addCookie(cookies[i]);
	}
*/

//특정 쿠키만 삭제
	Cookie ck = new Cookie("cName", null);
	ck.setMaxAge(0);
	response.addCookie(ck);
%>
<a href="getCookie.jsp">쿠키보기</a>
</body>
</html>