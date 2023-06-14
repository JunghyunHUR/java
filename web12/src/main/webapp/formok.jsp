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
		String uemail = request.getParameter("uemail");
	%>
	
	<jsp:forward page="form_result.jsp">
		<jsp:param value="<%= uemail %>" name="uemail" />
	</jsp:forward>
	
</body>
</html>