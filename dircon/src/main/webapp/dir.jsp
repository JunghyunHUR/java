<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*, java.util.Date" %>
<%
	String dir = request.getParameter("dir");
	if(dir == null) dir = ".";
	String path = application.getRealPath(dir);
	File dirfile = new File(path);
	File[] fileList = dirfile.listFiles();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=path %></title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<style>
	.list-group-item img{
		width: 30px;
		height: 30px;
	}
</style>
</head>
<body>
	<div class="container">
		<h2 class="text-center"><%= path %></h2>
		<ul class="list-group">
		<% 
			for(int i = 0; i < fileList.length; i++){
				String fname = fileList[i].getName();
		%>
			<li class="list-group-item">
				<div class="row">
				<% if(fileList[i].isDirectory()){ %>
					<div class="col-7">
						<img src="images/dir.png" alt="dir">
						<a href="dir.jsp?dir=<%= dir %>/<%= fname %>"><%= fname %></a>
					</div>
					<% }else{ %>
					<div class="col-7">
						<img src="images/file.png" alt="file">
						<a href="/dircon/FRead?dir=<%= dir %>&file=<%= fname %>"><%= fname %></a>
					</div>
					<%} %>
					<div class="col-2">
						<%= fileList[i].length() %>
					</div>
					<div class="col-3">
						<%
							Date t = new Date(fileList[i].lastModified());
							out.println(t.toLocaleString());
						%>
					</div>
				</div>
			</li>
		<%
			}
		%>
		</ul>
	</div>
</body>
</html>