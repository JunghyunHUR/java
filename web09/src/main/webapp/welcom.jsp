<%@page import="java.util.Enumeration"%>
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
		Enumeration en = session.getAttributeNames();
		while(en.hasMoreElements()){
			String sName = en.nextElement().toString();
			String sValue = (String)session.getAttribute(sName);
			
			if(sName.equals("userId")){
				out.println(sValue + "님, 방문을 환영합니다");
			}else{
				out.println("회원 전용 페이지 입니다.");
			}
		}
	%>
	 <a href='logout.jsp'>로그아웃</a> 
</body>
</html>