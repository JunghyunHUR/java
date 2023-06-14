<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.*, myRest.SQLConnection"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	boolean ok = false;
%>
<%
	String uid = request.getParameter("uid");
	//접속
	Connection conn = SQLConnection.initConnection();
	String sql = "select userId from members where userId = ?";
	
	try{
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, uid);
		
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			ok = true;
		}else{
			ok = false;
		}
		
	}catch(Exception e){
		
	}finally{
		try{
			conn.close();
		}catch(SQLException e){
			
		}
	}
	if(ok){
		out.print("중복된 아이디가 있습니다.");
		%>
		<form name='idchk'>
			<input type="text" name="uid" placeholder="아이디입력">
			<button type="submit">검색</button>
		</form>
		<%
	}else{
		out.print("사용 가능한 아이디 입니다.");
%>
		
		<button onclick="userId();">사용하기</button>
<%
	}
%>
<script>
function userId(){
	window.opener.document.memberform.userid.value='<%=uid%>';
	window.opener.document.getElementById('uid').value="ok";
	window.close();
}
</script>
<script src="js/script.js"></script>
</body>
</html>