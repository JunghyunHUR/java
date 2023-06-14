<%@ page isErrorPage ="true"  %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.text-center{
		text-align : center;
	}
	.detail{
		padding: 20px;
		border: 1px solid #ccc;
		display: none;
	}
</style>
</head>
<body>
	<h3 class='text-center'><%= exception.getClass().getName() %></h3>
	<div class="main">
		<%= exception.getMessage() %>
		<button type='button' onclick='showDetail()'>자세히 보기</button>
	</div>
	<div class="detail">
		<% exception.printStackTrace(new java.io.PrintWriter(out)); %>
	</div>
	<script>
	function showDetail(){
		const detail = document.getElementsByClassName("detail")[0];
		detail.style.display = "block";
	}

	</script>
</body>
</html>