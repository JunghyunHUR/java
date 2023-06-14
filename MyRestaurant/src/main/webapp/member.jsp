<%@page import="java.time.format.DateTimeFormatter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.*, java.net.*, java.time.*, myRest.SQLConnection"
%>

<%!
	Connection conn = null;
	PreparedStatement pstmt = null;
	InetAddress local = null;
	String ip=""; String sql="";
	int rows;
%>

<jsp:useBean id="mem" class="myRest.MemberDTO" scope="page" />
<jsp:setProperty name="mem" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//ip주소 찾기
	try{
		local = InetAddress.getLocalHost();
	}catch(UnknownHostException e){
		
	}
	if(local != null){
		ip = local.getHostAddress();
	}
	//out.print(ip);
	
	/*
	현재 날짜 찾기 :
		LocalDateTime 을 이용해 년월일시분초를 받은 후
		DateTimeformatter를 이용해 yyy-MM-dd hh:mm:ss 형식으로 출력
	*/
	
	//현재 날짜 받기 yyyy-mm-dd-hh:mm:ss
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
	String wrightday = now.format(formatter);
	
	//out.print(wrightday);
	
	//배열로 받은 값을 하나로 합침
	String[] hobby = mem.getHobby();
	String strHobby = "";
	for(String h : hobby){
		strHobby += h + " ";
	}
	sql = "insert into members (";
	sql += " username, userId, userpass, gender, postcode, address, detailAddress, job, hobby, LeftRight, writeDay, writeIP";
	sql += ") values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	//접속
	conn = SQLConnection.initConnection();
	
	try{
		
		pstmt = conn.prepareStatement(sql);
		
		System.out.println(pstmt);
		rows = pstmt.executeUpdate();
		
		if(rows > 0){
			out.print("정보를 입력했습니다.");
			
		}
		
		pstmt.close();
		
	}catch(SQLException e){
		
	}finally{
		if(conn != null){
			try{
				conn.close();
			}catch(SQLException e){
				
			}
		}
		
	}
	
%>

	이름 : <jsp:getProperty name="mem" property="username" />
	아이디 : <jsp:getProperty name="mem" property="userid" />
	비밀번호 : <jsp:getProperty name="mem" property="userpass" />
	성별 : <jsp:getProperty name="mem" property="gender" />
	우편번호 : <jsp:getProperty name="mem" property="postcode" />
	주소 : <jsp:getProperty name="mem" property="address" />
	상세 주소 : <jsp:getProperty name="mem" property="detailAddress" />
	직업 : <jsp:getProperty name="mem" property="job" />
	취미 : <jsp:getProperty name="mem" property="hobby" />
	좌우명 : <jsp:getProperty name="mem" property="leftright" />


</body>
</html>