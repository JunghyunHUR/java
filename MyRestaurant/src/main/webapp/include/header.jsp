<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String UID = null;
	int UNUM = 0;
%>

<%
	if(session.getAttribute("UID") != null){
		//System.out.println(session.getAttribute("UNUM"));
		UID = (String) session.getAttribute("UID");
		UNUM = (int) session.getAttribute("UNUM");
	}else{
		UID = null;
		UNUM = 0;
	}
%>