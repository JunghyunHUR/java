<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="info" class="jstlworks.ContactInfo" scope="page" />
<jsp:setProperty name="info" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>연락처 정보</h3>
    <ul>
        <li>이름 : <%= info.getUname() %> == ${info.uname} </li>
        <li>연락처 : <%= info.getUemail() %> == ${info.uemail}</li>
    </ul>
</body>
</html>