package 허정현_프로그램활용;

public class MemberService {
	//field
	//field에 id="ezen", password="12345" 로 저장한다. 
	String id = "ezen";
	String password = "12345";
	
	//method 
	//login method로 id와 password를 받는다
	void login(String id, String password) {
		// method에서 받은 id와 password 값이 저장된 id와 password값과 같을경우 true 
		// 다를 경우 false
		if(this.id == id && this.password == password) {
			//true일 경우 로그인 완료
			System.out.println("로그인 되었습니다.");
		}else {
			//false일 경우 id또 password가 틀렸다는 메시지 출력
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
	
	//로그아웃 실행
	void logout(String id) {
		//로그인 했던 아이디 로그아웃 실행
		if(id == this.id) {
			System.out.println(id + "님이 로그아웃 되었습니다.");
		}
	}

}
