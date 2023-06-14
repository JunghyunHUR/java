package 허정현_프로그램활용;

public class MemberServiceExam {
	
	public static void main(String[] args) {
		MemberService user = new MemberService();
		
		user.login("ezen", "12345");
		user.logout("ezen");
		user.login("홍길동", "54321");
	}

}
