<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ol>
		<li>
			<h4>문자열, 부동소수점, boolean, null 표현</h4>
			<P>
				<ul>
					<li>문자열 : ${"test"}</li>
					<li>문자열 : ${'test'}</li>
					<li>정수형 : ${30}</li>
					<li>부동소수점 : ${3.14}</li>
					<li>boolean : ${true}</li>
					<li>null : ${null}</li>
				</ul>
			</P>
		</li>
		
		<li>
			<h4>배열에서 값 꺼내기</h4>
			<p>
				<%
					pageContext.setAttribute("scores", new int[]{90, 19, 67, 88, 100});
				%>
				${scores[4]}
			</p>
		</li>
		
		<li>
		<%	
			List<String> list = new ArrayList<>();
			list.add("국어");
			list.add("영어");
			list.add("수학");
			
			pageContext.setAttribute("list", list);
		%>	
		<p>제가 가장 좋아하는 과목은 ${list[2]} 입니다.</p>
		</li>
		<li>
			<h4>3항 조건 연산</h4>
			<p>
				${10 > 20 ? "크다" : "작다"}
			</p>
		</li>
	</ol>
</body>
</html>