<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <p>코어(core) 라이브러리</p>
    <ul>
        <li>
            <label>수식, 언어 지원 기능</label>
            &lt;catch&gt;, &lt;out&gt;, &lt;remove&gt;, &lt;set&gt;
        </li>
        <li>
            <label>제어</label>
            &lt;choose&gt;, &lt;when&gt;, &lt;otherwise&gt;, &lt;forEach&gt;, &lt;forToken&gt;
        </li>
        <li>
            <label>URL 관리</label>
            &lt;import&gt;, &lt;param&gt;, &lt;redirect&gt;, &lt;url&gt;
        </li>
    </ul>
    <h4>Core의 if 테스트</h4>
    <c:if test="${!empty param.uname}">
        이름 : ${param.uname}
    </c:if>
    <c:set value="${param.uname}" var="vars" scope="page" />
    <h4>Switch</h4>
    <c:choose>
    	<c:when test="${param.uname eq '김철수' }">
    		${param.uname} 바보
    	</c:when>
    	<c:when test="${param.uname eq '홍길동' }">
    		${param.uname} 최고
    	</c:when>
    	<c:otherwise>
    		${param.uname} 어쩌라구
    	</c:otherwise>
    </c:choose>
    <br>
    <%
	    if(request.getParameter("uname") != null){
	        out.println("이름 : " + request.getParameter("uname"));
	    }
    %>
    <h4>escape 문자로 출력할 것인지 그냥 출력할 것인지 경정</h4>
    <c:out value="<script type='text/javascript'>alert('와우')</script>" escapeXml="true" />

    <h4>변수에 값을 설정</h4>
    <c:set value="값" var="vars" scope="page" />
    ${vars}
    
    <h4>예외처리</h4>
    <c:catch var="e">
    	예외구문.....
	</c:catch>
	
    <h4>forEach</h4>
    <%
		List<String> list = new ArrayList<>(Arrays.asList("김포", "고양", "인천", "파주"));
		request.setAttribute("areaList", list);
    %>
    <ul>
	    <c:forEach var="name" items="${areaList}" varStatus="status">
	    	<li>${status.count} : <c:out value="${name}"/> </li>	
	    </c:forEach>
    </ul>
    
    <c:forEach var="i" begin="0" end="5">
    	<!-- ${i} -->
    	<c:out value="${i}" />
    </c:forEach>
    
    <h4>문자열 분리해서 출력</h4>
    <c:forTokens var="name" items="홍정원, 허정현, 최형윤, 최인영, 최누리" delims=",">
        ${name} <br/>
    </c:forTokens>
    
    <h4>구구단 2단</h4>
    <c:forEach var="i" begin="1" end="9">
    	<c:out value="2 * ${i} = ${i*2}" /> <br/>
    </c:forEach>
    
    <h1>구구단</h1>
    <c:forEach var="i" begin="2" end="9">
    	<h3><c:out value="${i}단 " /></h3>
    	<c:forEach var="j" begin="1" end="9">
    		<c:out value="${i} * ${j} = ${i*j}" /> <br/>
    	</c:forEach>
    	<br/>
    </c:forEach>
</body>
</html>