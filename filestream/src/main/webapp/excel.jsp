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
            <td colspan=3 align=center><strong>���� ����</strong></td>
        </tr>
        <tr>
            <th>�̸�</th>
            <th>����(��� : ����)</th>
            <th>�ּ�</th>
        </tr>
        <tr>
            <td>��˰�</td>
            <td>600</td>
            <td>�λ�</td>
        </tr>
        <tr>
            <td>��õ��</td>
            <td>550</td>
            <td>����</td>
        </tr>
        <tr>
            <td>ȫ�浿</td>
            <td>660</td>
            <td>������</td>
        </tr>
    </table>
</body>
</html>