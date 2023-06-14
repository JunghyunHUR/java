<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@
	page import="java.sql.*, myRest.SQLConnection"
%>
<jsp:useBean id="mem" class="myRest.MemberDTO" />
<jsp:setProperty name="mem" property="*" />
<%!
	Connection conn = null;
	PreparedStatement pstmt = null;
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
	
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
    <script src="//dapi.kakao.com/v2/maps/sdk.js?appkey=0d90fbf39d1f79ef8b0055bbf4a0644e"></script>
    <script src="js/jquery-1.12.4.min.js"></script>
    <script src="js/jquery.mobile-1.3.2.min.js"></script>
    <script src="js/custom.js"></script>
    <script src="js/script.js"></script>
    <script src="js/members.js"></script>
    
   
</head>
<body>
	<div id="memberlist" data-role="page" data-theme="c">
		<%@ include file="include/header.jsp" %>
<%
	if(UNUM == 0){
%>
<script>		
		alert("에러가 발생했습니다.");
		document.location.href="index.jsp";
</script>
<%
	}else{
		
		conn = SQLConnection.initConnection();
		sql = "select * from members where number = ?";
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, UNUM);
			rs = pstmt.executeQuery();
			if(rs.next()){
%>
        <div data-role="content">
       		<form name="memberedit" id="memberedit" action="memberedit.jsp" method="post" onsubmit="return checkEdtform();">
	        	<ul data-role="listview" data-inset="true" data-divider-theme="d">
			        <li data-role="list-divider">필수항목</li>
			        <li data-role="fieldcontain">
				        <label for="username">이름</label>
				        <input type="text" name="username" id="username" value="<%= rs.getString("username") %>" data-clear-btn="true" />
			        </li>
			        <li data-role="fieldcontain">
						<label for="userid">아이디</label>
						<input type="text" name="userid" id="userid" value="<%= rs.getString("userid") %>" readonly />
					</li>
			        <li data-role="fieldcontain">
						<label for="userpass">비밀번호</label>
						<input type="password" name="userpass" id="userpass" value="" data-clear-btn="true" />
					</li>
			        <li data-role="fieldcontain">
						<label for="postcode" class="post">우편번호</label>
						<input type="number" name="postcode" id="postcode" value="<%= rs.getInt("postcode") %>" data-clear-btn="true" />
					</li>
			        <li data-role="fieldcontain" id="addressbox">
						<label for="address">주소</label>
						<input type="text" name="address" id="address" value='<%= rs.getString("address") %>' data-clear-btn="true" />
						<input type="text" name="detailaddress" id="detailaddress" value="<%= rs.getString("detailaddress") %>" data-clear-btn="true" />
					</li>
					<%
						String chk1="", chk2="";
							if(rs.getString("gender").equals("man")){
								chk1 = "checked";
								chk2 = "";
							}else{
								chk1 = "";
								chk2 = "checked";
							}
					%>
					<li data-role="list-divider">선택항목</li>
					
			        <li data-role="fieldcontain">
						<label for="gender" class="ui-input-text" id="genderlabel">성별</label>
						<select name="gender" id="gender" data-role="slider">
							<option value="man" <%= chk1 %>>남자</option>
							<option value="woman" <%= chk2 %>>여자</option>
						</select>
					</li>
					<%
						String[] jobArray = {"프론트앤드 프로그래머", "백앤드 프로그래머", "풀스택 프로그래머", "UI디자이너", "입만 프로그래머"};
						String[] hobbyArray = {"운동", "여행", "독서", "음악감상", "쇼핑"};
					%>
			        <li data-role="fieldcontain">
						<label id="radiobox">직업</label>
						<fieldset data-role="controlgroup">
					<%
						int i = 1;
						for(String jobs : jobArray){
							if(jobs.equals(rs.getString("job"))){
								out.print("<input type=\"radio\" name=\"job\" id=\"job" + i + "\" value=\""+ jobs +"\" checked>");
								out.print("<label for=\"job" + i + "\">"+ jobs +"</label>");
							}else{
								out.print("<input type=\"radio\" name=\"job\" id=\"job" + i + "\" value=\""+ jobs +"\">");
								out.print("<label for=\"job" + i + "\">"+ jobs +"</label>");
							}
							i++;
						}
					%>
						<!--  
							<input type="radio" name="job" id="job1" value="프론트앤드 프로그래머" checked>
							<label for="job1">프론트앤드 프로그래머</label>
							<input type="radio" name="job" id="job2" value="백앤드 프로그래머">
							<label for="job2">백앤드 프로그래머</label>
							<input type="radio" name="job" id="job3" value="풀스택 프로그래머">
							<label for="job3">풀스택 프로그래머</label>
							<input type="radio" name="job" id="job4" value="UI 디자이너">
							<label for="job4">UI 디자이너</label>
							<input type="radio" name="job" id="job5" value="입만 프로그래머">
							<label for="job5">입만 프로그래머</label>
						-->
						</fieldset>
					</li>
			        <li data-role="fieldcontain">
						<label id="checkbox">취미</label>
						<fieldset data-role="controlgruop">
						<%
							i = 1;
							for(String hobbys : hobbyArray){
								if(rs.getString("hobby").contains(hobbys)){
									out.print("<input type=\"checkbox\" name=\"hobby\" id=\"hobby" + i + "\" value=\""+ hobbys +"\" checked>");
									out.print("<label for=\"hobby" + i + "\">"+ hobbys +"</label>");
								}else{
									out.print("<input type=\"checkbox\" name=\"hobby\" id=\"hobby" + i + "\" value=\""+ hobbys +"\" >");
									out.print("<label for=\"hobby" + i + "\">"+ hobbys +"</label>");
								}
								i++;
							}
						%>
						<!--  
							<input type="checkbox" name="hobby" id="hobby1" value="운동" checked /> 
							<label for="hobby1">운동</label> 
							<input type="checkbox" name="hobby" id="hobby2" value="여행" /> 
							<label for="hobby2">여행</label> 
							<input type="checkbox" name="hobby" id="hobby3" value="독서" /> 
							<label for="hobby3">독서</label> 
							<input type="checkbox" name="hobby" id="hobby4" value="음악감상" />
							<label for="hobby4">음악감상</label> 
							<input type="checkbox" name="hobby" id="hobby5" value="쇼핑" /> 
							<label for="hobby5">쇼핑</label>
						-->
						</fieldset>
					</li>
			        <li data-role="fieldcontain">
						<label for="leftright">좌우명</label>
						<input type="text" name="leftright" id="leftright" value="<%=rs.getString("leftright") %>" data-clear-btn="true" />
					</li>
					
			    </ul>
			    <div class="text-center btnbox">
					<button type='submit' class="submit"> 수 정 </button>
				</div>
				<input type="hidden" name="num" value="<%=UNUM%>">
			</form>
		</div>
		
<%
			}
		}catch(Exception e){}finally{
			if(rs != null) try{rs.close();}catch(SQLException e){}
			if(pstmt != null) try{pstmt.close();}catch(SQLException e){}
			if(conn != null) try{conn.close();}catch(SQLException e){}
		}
	}// end if
%>
	</div>
	<!--  팝업 -->
      <div id="popupPostcode" style="display:none; position:fixed; overflow:hidden; z-index:100; -webkit-overflow-scrolling:touch;">
         <img src="//t1.daumcdn.net/postcode/resource/images/close.png" id="btnCloseLayer" style="cursor:pointer; position:absolute; right:-3px; top:-3px; z-index:1" alt="닫기 버튼">
      </div>
    <!--  /팝업  -->
		<%@ include file="include/footer.jsp" %>
</body>
</html>