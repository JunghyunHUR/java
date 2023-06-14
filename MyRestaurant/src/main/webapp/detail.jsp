<%@page import="com.mysql.cj.x.protobuf.MysqlxPrepare.Execute"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.*, myRest.SQLConnection"
    %>
<%!
	Connection conn = null;
	PreparedStatement pstmt = null, pstmt2 = null;
	ResultSet rs = null, rs2 = null;
	String sql = "", sql2 = "";
%>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	sql = "select * from best_restaurant where num = ?";
	conn = SQLConnection.initConnection();
	
%>
<%
	try{
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		rs = pstmt.executeQuery();
		if(rs.next()){
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

	<div id="detail" data-role="page" data-theme="c">
		<%@ include file="include/header.jsp" %>
        <div data-role="content">
            <div id="brand">
                <h1><span>맛집</span> <span>검색</span></h1>
            </div>
            <div class="ui-grid-a" id="restau_infos">
                <div class="ui-block-a">
                    <h1><%= rs.getString("title") %></h1>
                    <p><%= rs.getString("sectordetail") %></p>
                    <p>On the menu:</p>
                    <ul>
                        <li>밀크쉐이크 50,000원</li>
                        <li>소고기 2,000원</li>
                        <li>물 4,000원</li>
                    </ul>
                </div>
                <div class="ui-block-b">
	                    <input type="hidden" id="lat" name="lat" value="<%= rs.getFloat("lat")%>">
						<input type="hidden" id="lon" name="lon" value="<%= rs.getFloat("lon")%>">
                    <div class="roadview" id="roadview"></div>
                    <p><a href="index.jsp" rel="external" data-role="button">홈페이지</a></p>
                </div>
            </div>   <!--/.grid-a-->

            <hr />

            <div class="ui-grid-a" id="contact_infos">
                <div class="ui-block-a">
                    <h2>Contact Us</h2>
                    <p>연락 주시면 30분 내로 달려갑니다. 지금 전화주세요. 예약문의도 환영합니다.</p>
                    <p>🐱‍🏍 초고속 배달 서비스</p>
                </div>
                <div class="ui-block-b">
                    <div class="map" id="map">
                    </div>
                </div>
            </div><!-- /.grid-a -->
             <a href="tel:<%= rs.getString("tel") %>" data-role="button" class="ui-cellphone" data-icon="tel">전화주문(예약, 문의)</a>
        </div>
        
        <hr />
        <div id="notation">
            <label for="" id="select"> <h1>회원리뷰</h1></label>
            <%	
	            int rnum = Integer.parseInt(request.getParameter("num"));
            	
            	sql2 = "select * from review join members where unum = number and rnum = ?";
            	pstmt = conn.prepareStatement(sql2);
            	pstmt.setInt(1, rnum);
            	rs2 = pstmt.executeQuery();
   				
            	
            	while(rs2.next()){
            %>		
            <div class="review-box">
            	<div class="rvuname">
            		<p><%= rs2.getString("username") %></p>
            	</div>
            	<div class="review">
            		<p><%= rs2.getString("content") %></p>
            	</div>
            	<div class="review-star">
            		<p><%= rs2.getInt("star") %></p>
            	</div>
            	<div class="review-date">
            		<p><%= rs2.getString("writeday") %></p>
            	</div>
            	
            </div>
            <%
            	}
            %>
            <form name="reviewform" action="reviewok.jsp" id="reviewform" method="post">
                <div>
                    <select name="star" id="note_utilisateur" data-native-menu="false" data-theme="c">
                        <option value="1" class="one">별로입니다.</option>
                        <option value="2" class="two">쫌 별로입니다.</option>
                        <option value="3" class="three">무난합니다.</option>
                        <option value="4" class="four" selected>맛있습니다.</option>
                        <option value="5" class="five">열라맛납니다.</option>
                    </select>
                </div>
                <div>
                    <label for="contentbox">하실말씀</label>
                    <textarea name="content" rows="5" class="contentbox" id="contentbox"></textarea>
                </div>
                <button type="button" id="submit" data-icon="check" data-iconpos="right">전송</button>
                <input type="hidden" name="unum" value="<%= UNUM %>" />
                <input type="hidden" name="rnum" value="<%= num %>" />
            </form>
        </div>
        <%@ include file="include/footer.jsp" %>
    </div>
    
</body>
</html>
<%	
		}
	}catch(SQLException e){}finally{
		if(rs != null)try{rs.close();}catch(SQLException e){};
		if(pstmt != null)try{pstmt.close();}catch(SQLException e){};
		if(conn != null)try{conn.close();}catch(SQLException e){};
	}

%>