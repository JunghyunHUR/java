<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>아이디 중복 체크</title>
</head>
<body onload="pValue()">
    <div id="wrap">
        <br>
        <b><font size="4" color="gray">아이디 중복 체크</font></b>
        <hr size="1" width="460">
        <br>
        <div id="chk">
            <form id="checkFrom">
                <input type="text" name="chkid" id="chkid">
                <button type="button" onclick="idcheck()">중복확인</button>
            </form>
            <div id="msg"></div>
            <br>
            <button type="button" id="cancelBtn" onclick="window.close()">취소</button><br>
            <button type="button" id="useBtn" onclick="sendCheckValue()">사용하기</button>
        </div>
    </div>

<script src="../resource/js/form.js"></script>
</body>
</html>