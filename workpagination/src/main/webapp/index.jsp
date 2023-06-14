<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.sql.*, javax.sql.*, javax.naming.* " %>
<!--
	=> 현재 페이지 번호 
	1. 전체 컬럼의 갯수 ex) 300
	2. 한 화면에 보여줄 페이지 수 ex) 10
	3. 현재 리스트 번호
	4. 한 번에 보여줄 리스트 번호 mlist
	
	예) 현재 페이지 번호가 없거나 page = 1
		minList = ((page-1) * mlist)
		limit minList , maxList
		
 -->
<%!
	int listNum = 12; //한페이지 당 목록 수
	int pageNum = 15; //한 블럭당 보여줄 페이지 수
	

	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet row = null, rs = null;
	String sql = null, query = null;
	DataSource ds;
	int maxColumn = 0;
	int block, startpg, endpg;
	
	
	public void jsInit(){
		try{
			Context initCnt = new InitialContext();
			Context env = (Context)initCnt.lookup("java:comp/env");
			ds = (DataSource)env.lookup("jdbc/mywork");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public int getPageCount(int numPerPage, int dataCount){
		int pageCount = 0;
		
		pageCount = dataCount /numPerPage; 
		
		if(dataCount % numPerPage != 0 )
			pageCount++;
		
		
		return pageCount;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	p{
		text-align: center;
	}
	table{
		margin: 0 auto;
		width: 300px;
		border-collapse: collapse;
		text-align: center;
		width: 900px;
	}
	table, th, td{
		border: 1px solid #999;
	}
	th,td{
		padding: 10px 15px;
		white-space: nowrap;
		
	}
	th{
		background: #ededed;
	}
	.pagination{
		width: 600px;
		margin: 15px auto;
		display: flex;
		justify-content: space-between;
		align-items: center;
	}
	.pagination a{
		border-radius: 50%;
		border: 1px solid #ddd;
		text-decoration: none;
		color: #000;
		font-size: 14px;
		display: inline-block;
		width: 25px;
		height: 25px;
		text-align: center;
		line-height: 25px;
		transition: all 300ms;
	}
	.pagination a.etc{
		border-radius: 5px;
		width: 40px;
		
	}
	.pagination a.active,
	.pagination a:hover{
		background: #ddd;
	}

</style>
</head>
<body>
<%
	jsInit();
	java.sql.Connection conn = ds.getConnection();
	String pg = request.getParameter("page");
	int mypg = 1;
	if(pg == null || pg.length() == 0){
		mypg = 1;
	}
	try{
		mypg = Integer.parseInt(pg);
		if(mypg < 1){
			mypg = 1;
		}
	}catch(Exception e){
		mypg = 1;
	}
	
	/* */
	int limitNum = (mypg - 1) * listNum;
	
	query = "select count(*) from best_restaurant";
	stmt = conn.createStatement();
	row = stmt.executeQuery(query);
	if(row.next()){
		maxColumn = row.getInt(1);
	}
	/* */
	
	sql = "select * from best_restaurant order by num desc limit ?, ?";
	try{
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, limitNum);
		pstmt.setInt(2, listNum);
		rs = pstmt.executeQuery();
%>
	<p>전체 게시글 : <%= maxColumn %></p>
	<table>
		<colgroup>
			<col width="5%">
			<col width="25%">
			<col width="45%">
			<col width="25%">
		</colgroup>
		<tr>
			<th>번호</th>
			<th>상점이름</th>
			<th>종류</th>
			<th>전화번호</th>
		</tr>
<%
		while(rs.next()){
%>
		<tr>
			<td>
		<%= rs.getString("num") %>
			</td>
			<td>
		<%= rs.getString("title") %>
			</td>
			<td>
		<%= rs.getString("sectors") %> (<%= rs.getString("sectordetail") %>)
			</td>
			<td>
		<%= rs.getString("tel") %>	
			</td>
		</tr>
<%	
		}
%>
	</table>
<%
	}catch(SQLException e){
		out.print("DB연결에 실패했습니다.");
	}finally{
		try{
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e){}
	}
%>
<%
	//전체 페이지 수 = 전체 데이터 수 / 페이지당 목록 수 올림 Math.ceil
	int totalPage = (int)Math.ceil(maxColumn / (double)listNum);
	
	//전체 블럭 수 = 전체 페이지 수 / 블럭 당 보여줄 페이지 수
	int totalBlock = (int)Math.ceil(totalPage / (double)pageNum);
	
	//현재 블럭 번호 = 현재 페이지 번호 / 블럭 당 페이지 수
	int nowBlock = (int)Math.ceil(mypg / (double)pageNum);
	
	//블럭당 시작페이지 번호 = (현재블럭번호 - 1) * 블럭당 페이지 수 + 1
	int sPageNum = (nowBlock - 1) * pageNum + 1;
	
	//블럭당 마지막 페이지 번호 = 현재블럭번호 * 블럭당 페이지 수
	int ePageNum = nowBlock * pageNum;
	if(ePageNum > totalPage){ ePageNum = totalPage;}
%>
전체 페이지 수 : <%= totalPage %>
전체 블럭 수 : <%= totalBlock %>
현재 블럭 : <%= nowBlock %>
블럭당 시작 번호 : <%= sPageNum %>
블럭당 마지막 번호 : <%= ePageNum %>

	<div class="pagination">
		
	<%
	//이전 페이지 출력
	if(sPageNum <= 1){
		out.print("<a href=\"?page=1\" class=\"etc\">이전</a>");
	}else{
		int prevPage = sPageNum - 1;
		out.print("<a href=\"?page="+ prevPage +"\" class=\"etc\">이전</a>");
	}
	%>
		<a href="?page=<%= mypg - 1 %>"><</a>	
	<%
	//페이지 출력
	for(int i = sPageNum; i <= ePageNum; i++){
		String active = "";
		if(mypg == i){
			active = "active";
		}
	%>
			<a href="?page=<%= i %>" class="<%= active%>"><%= i %></a>
	<%
	}
	%>
			<a href="?page=<%= mypg + 1 %>">></a>
	<%
	//다음 페이지 출력
	if(sPageNum >= totalPage){
		out.print("<a href=\"?page="+ totalPage +"\" class=\"etc\">다음</a>");
	}else{
		int nextPage = ePageNum + 1;
		out.print("<a href=\"?page="+ nextPage+"\" class=\"etc\">다음</a>");
	}
	%>		
	</div>
</body>
</html>