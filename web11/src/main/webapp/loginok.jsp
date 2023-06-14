<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="mem" class="web11.Contact" scope="page" />
<jsp:setProperty name="mem" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>고객님 정보</h1>
	<ul>
		<li>이름 : ${ mem.username }</li>
		<li>이메일 : ${ mem.useremail }</li>
		<li>비밀번호 : ${ mem.userpass }</li>
	</ul>
</body>
</html>