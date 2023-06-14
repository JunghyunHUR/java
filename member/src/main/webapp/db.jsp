<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.*"
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	String url, id = "root", passwd = "ss2414ss";
	public void jspInit(){
		try{
			url = "jdbc:mysql://localhost:3306/mywork";
			String option = "characterEncoding=UTF-8";
			url = url+"?"+option;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
%>

<%
	String sql = "select * from best_restaurant order by num desc limit 0, 40";
	Connection conn = DriverManager.getConnection(url, id, passwd); 
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery(sql);
	while(rs.next()){
%>
	<%= rs.getString("title")  %><br>
<%
	}
%>
</body>
</html>