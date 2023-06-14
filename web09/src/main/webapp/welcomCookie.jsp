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
		String val = cookies[i].getValue();
		if(str.contains("cName")){
			if(val.contains("cValue")){
				out.println("다시오셨군요 환영합니다.");
			}else{
				out.println("어서오세요. 첫 방문이시네요.");
			}
		}
	}
%>
</body>
</html>