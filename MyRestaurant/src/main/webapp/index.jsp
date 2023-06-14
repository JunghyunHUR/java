<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.*, myRest.SQLConnection, java.net.*"
    %>
<%!
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = "";
%>
<!DOCTYPE html>
<html lang="ko-KR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>맛집검색</title>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&family=Tilt+Prism&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/jquery.mobile-1.3.2.min.css">
    <link href="https://cdn.jsdelivr.net/npm/remixicon@2.2.0/fonts/remixicon.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style2.css">

    <script src="//dapi.kakao.com/v2/maps/sdk.js?appkey=6e4ebc12212757f502bf7fb3dbf576e5"></script>
    <script src="js/jquery-1.12.4.min.js"></script>
    <script src="js/jquery.mobile-1.3.2.min.js"></script>
    <script src="js/custom.js"></script>
    <script>
    $(document).on("mobileinit",function(){
        $('#list02').on("pageshow", function(){
            loadview01();
        });
        $('#detail').on("pageshow", function(){
        	loadview02();
        });
        
    }); //jquery
    </script>
</head>
<body>
<div id="main" data-role="page" data-theme="c">
<%@ include file="include/header.jsp" %>
        <div data-role="content">
            <div id="brand">
                <h1><span>맛집</span> <span>검색</span></h1>
            </div>
            <div class="choice_list">
                <h2><span class="number"><i class="ri-number-1"></i></span>카테고리를 선택하세요.</h2>
                <!-- listview -->
                <ul data-role="listview" data-inset="true">
	<%
		conn = 	SQLConnection.initConnection();
		sql = "select distinct sectordetail from best_restaurant";
		try{
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			String[] img = {"cate01.jpg", "cate02.jpg", "cate03.jpg", "cate04.jpg", "cate05.jpg", "cate06.jpg", "cate07.jpg"};
			int i = 0;
			while(rs.next()){
				String sct = URLEncoder.encode(rs.getString("sectordetail"));
			
	%>
		<li><a href="list01.jsp?sectordetail=<%= sct %>" data-transition="slidedown"><img src="images/<%= img[i] %>" alt="<%= rs.getString("sectordetail") %>"><h3><%= rs.getString("sectordetail") %></h3></a></li>
	<%
		i++;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs != null)try{rs.close();}catch(SQLException e){}
			if(stmt != null)try{stmt.close();}catch(SQLException e){}
			if(conn != null)try{conn.close();}catch(SQLException e){}
		}
	%>
                </ul>
            </div>
        </div>
    
<%@ include file="include/footer.jsp" %>
</div>


</body>
</html>