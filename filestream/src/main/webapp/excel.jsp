<%@ page language="java" contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%
	response.setHeader(
				"Content-Disposition",
				"attachment;filename=example.xls"
			);
%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
    <table>
        <tr>
            <td colspan=3 align=center><strong>월급 명세서</strong></td>
        </tr>
        <tr>
            <th>이름</th>
            <th>월급(답원 : 만원)</th>
            <th>주소</th>
        </tr>
        <tr>
            <td>김똥개</td>
            <td>600</td>
            <td>부산</td>
        </tr>
        <tr>
            <td>이천사</td>
            <td>550</td>
            <td>남원</td>
        </tr>
        <tr>
            <td>홍길동</td>
            <td>660</td>
            <td>율도국</td>
        </tr>
    </table>
</body>
</html>