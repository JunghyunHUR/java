function checkfrom(){
	const frm = document.memberform;
	if(frm.username.value == ""){
		frm.username.focus();
		alert("이름을 입력하세요");
		return false;
	}
	if(frm.userid.value == ""){
		frm.userid.focus();
		alert("아이디를 입력하세요");
		return false;
	}
	if(frm.uid.value == ""){
		frm.userid.focus();
		alert("아이디 중복 확인을 해주세요");
		return false;
	}
	if(frm.userpass.value == ""){
		frm.userpass.focus();
		alert("비밀번호를 입력하세요");
		return false;
	}
	if(frm.address.value == ""){
		frm.postcode.focus();
		alert("주소를 입력하세요");
		return false;
	}
	if(frm.userjob.value == ""){
		frm.job.focus();
		alert("직업을 선택하세요");
		return false;
	}
}



function execDaumPostcode() {
	new daum.Postcode({
		oncomplete: function(data) {
			// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

			// 각 주소의 노출 규칙에 따라 주소를 조합한다.
			// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
			let addr = ''; // 주소 변수

			//사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
			if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
				addr = data.roadAddress;
			}else { // 사용자가 지번 주소를 선택했을 경우(J)
				addr = data.jibunAddress;
			}


			// 우편번호와 주소 정보를 해당 필드에 넣는다.
			document.getElementById('postcode').value = data.zonecode;
			document.getElementById("address").value = addr;
			// 커서를 상세주소 필드로 이동한다.
			document.getElementById("detailAddres").focus();
		}
	}).open();
}
/*
function idCheck(){
	const uid = document.getElementById("userid").value;
	const url = "IDcheck.jsp?uid="+uid;
	if(uid == ""){
		alert("아이디를 입력하세요");
		frm.userid.focus();
	}else{
		window.open(url,"chkForm","width=600px height=200px resizeable=no status=no toolbar=no top=100px left=300px");
	}
}
*/

function loginform(){
	if($("#un").val() && $("#pw")){
	} 
}