<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- <%@ page isELIgnored="true" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Header information</h1>
	<ul>
		<li>
			<label>Web Browser Information : </label>
			${ header["user-agent"] }
		</li>
	</ul>
	<p>request 정보 : </p>
	<ul>
		<li>
			<label>HTTP method : </label>
			${ pageContext.request.method }
		</li>
	</ul>
	
	<p>Get Parameter Value</p>
	<ul>
		<li>name Parameter : ${ param.name }</li>
		<li>name Parameter Value is Space? : ${ empty param.name }
	</ul>
	
	<p>Get Cookie Value</p>
	<ul>
		<li> Session ID : ${ cookie["JSESSIONID"].value }</li>
	</ul>
	
	
	
	<h1>Operator</h1>
	
	<p>2 + 5 = <%= 2 + 5 %></p>
	<p>2 + 5 = ${ 2 + 5 }</p>
	
	<p>++++</p>
	<p>2 / 5 = <%= 2 / 5 %></p>
	<p>2 / 5 = ${ 2 / 5 }</p>
	
	<p>++++</p>
	<p>2 < 5 = <%= 2 < 5 %></p>
	<p>\${2 < 5} = ${ 2 < 5 }</p>
	
	<p>${ (1 > 3) ? 3 : 1 }</p>
	<p>${ (1>2) || (1<2) } </p>
	
	<p>++++</p>
	<p>${10}</p>
	<p>${99.99}</p>
	<p>${"ABC"}</p>
	<p>${ false }</p>
	
	
	
</body>
</html>