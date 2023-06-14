<%@ page 
		language="java" 
		contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8"%>
<%@ page errorPage = "error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>default 파일 입니다.</h1>
<ol>
	<li>서버 : <%= request.getServerName() %></li>
	<li>포트 번호 : <%= request.getServerPort() %></li>
	<li>프로토콜 : <%= request.getProtocol() %></li>
	<li>URL : <%= request.getRequestURL() %></li>
	<li>URI : <%= request.getRequestURI() %></li>
	<li>QueryString : <%= request.getQueryString() %></li>
</ol>
<%--
<jsp:forward page="sub.jsp">
	<jsp:param name="userid" value="abcdef" />
	<jsp:param name="userpw" value="123456" />
</jsp:forward>
--%>
<jsp:include page="copyright.jsp" flush="true" />
<%-- <%@ include file = "copyright.jsp" %>--%>
</body>
</html>