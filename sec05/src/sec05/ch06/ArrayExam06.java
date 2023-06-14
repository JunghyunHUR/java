package sec05.ch06;

public class ArrayExam06 {
		// chatAt(번호)
		// 철수의 주민번호는 010101-4012443
		// 철수가 남자인지 여자인지 확인하라..

	public static void main(String[] args) {
		String ssn = "010101-4012443";
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1' :
		case '3' :
			System.out.println("철수는 남자입니다.");
			break;
		case '2' :
		case '4' :
			System.out.println("철수는 여자입니다.");
			break;
		}
		
		String oStr = "자바 프로그래머";
		String nStr = oStr.replace("자바", "JAVA");
		System.out.println(nStr);
	}

}
