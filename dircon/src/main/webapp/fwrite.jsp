<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<%
	request.setCharacterEncoding("UTF-8");
	String dir = request.getParameter("dir");
	String file = request.getParameter("file");
	String fileContents = request.getParameter("contents");
	if(dir == null || file == null) return;
	
	String path = application.getRealPath(dir);
	BufferedWriter fw = new BufferedWriter(new FileWriter(path + "/" + file));
	fw.write(fileContents, 0, fileContents.length());
	fw.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= file %>이 <a href="dir.jsp?dir<%= dir%>"><%= dir%></a> 디렉토리에 저장되었습니다.
</body>
</html>