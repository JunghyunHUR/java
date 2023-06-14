<%@ page language="java" contentType="image/gif" %>
<%@ page import="java.io.*" %>
<%
	byte[] buffer = new byte[1024];
	ServletOutputStream so = response.getOutputStream();
	try{
		String img = application.getRealPath("images/001.gif");
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(img));
		int i = 0;
		while((i = in.read(buffer, 0, 1024)) != -1){
			so.write(buffer, 0, i);
		}
		so.close();
		in.close();
	}catch(Exception e){}
%>
