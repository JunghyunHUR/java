package sec05.ch06;

public class ArrayExam07 {

	public static void main(String[] args) {
		String ssn = "010101-4012443";
		String nssn = ssn.replace("-", "");
		int length = nssn.length();
		if(length == 13) {
			System.out.println("맞는 주민번호입니다.");
		}else {
			System.out.println("틀린 주민번호입니다.");
		}

		System.out.println(ssn.substring(7)+ssn.charAt(6)+ssn.substring(0,6));
		
		String str = "떠들지 마라 좀";
		int index = str.indexOf("나쁜놈");
		if(index == -1) {
			System.out.println("찾는문자가 없음");
		}else {
			System.out.println("찾은문자 시작번호" + index);
		}
	}

}
