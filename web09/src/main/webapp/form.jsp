<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action ="form.jsp" method="post">
	<div class="name">
		<label for="name">이름</label>
		<input type="text" name="name">
	</div>
	<div class='age'>
		<label for="age">나이</label>
		<input type="text" name='age'>
	</div>
	<div class="address">
		<label for="address">주소</label>
		<input type='text' name='address'>
	</div>
	<button type='submit'>입력</button>
</form>
<%
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String address = request.getParameter("address");
	
	if(name != null && age != null && address != null){
		out.println("이름 : " + name );
		out.println("나이 : " + age );
		out.println("주소 : " + address );
	}
%>

</body>
</html>