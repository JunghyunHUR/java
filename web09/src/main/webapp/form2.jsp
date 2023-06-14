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
	String[] user = request.getParameterValues("user");
	if(user == null){
%>

<form name='form' method="post">
	<div>
		<label>이름</label>
		<input type="text" name="user">
	</div>
	<div>
		<label>나이</label>
		<input type="text" name='user'>
	</div>
	<div>
		<label>주소</label>
		<input type='text' name='user'>
	</div>
	<button type='submit'>입력</button>
</form>
		
<%
	}else {
%>
	<h1>당신의 정보</h1>
	<ul>
<%
	for(int i = 0; i < user.length; i++){
%>
	<li><%= user[i] %></li>
<%
	}
%>
</ul>
<%
}
%>

<a href="<%= request.getRequestURI() %>">다시입력</a>
</body>
</html>