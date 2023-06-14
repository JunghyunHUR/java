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
		
		Cookie[] cookies = request.getCookies();
		for(int i = 0; i < cookies.length; i++){
			String str = cookies[i].getName();
			out.println("cookie Name : " + cookies[i].getName() + "<br/>");
			out.println("cookie Value : " + cookies[i].getValue() + "<br/>");
		}
		for(int i = 0; i < cookies.length; i++){
			if(cookies[i].getName().equals("cName") && cookies[i].getValue().equals("cValue")){
				out.println("다시 방문하신것을 환영합니다.");
			}else{
				out.println("새 방문을 환영합니다.");
			}
		}
		
	%>
	<a href="delCookie.jsp">쿠키삭제</a>
</body>
</html>