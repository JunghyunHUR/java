<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
    	String userId, userPwd, contextId, contextPwd;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	contextId = application.getInitParameter("userId");
	contextPwd = application.getInitParameter("userPwd");

	userId = request.getParameter("userId");
	userPwd = request.getParameter("userPwd");
	
	if(userId.equals(contextId) && userPwd.equals(contextPwd)){
		session.setAttribute("userId", userId);
		response.sendRedirect("welcom.jsp");
	}else{
%>

	<script> 
		alert("이메일 또는 비밀번호가 틀렸습니다.");
		location.href="login.html";
	</script>
		
<%
		//response.sendRedirect("login.html");
	}
%>

</body>
</html>