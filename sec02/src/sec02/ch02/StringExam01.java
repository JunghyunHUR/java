package sec02.ch02;

public class StringExam01 {

	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		// 홍길동은 "자바"를 잘 합니다.
		// 번호		이름		직업
		// 자바
		// 스크립트
		
		String str = "홍길동은 \"자바\"를 잘 합니다.";
		System.out.println(str);
		
		String str2 = "번호\t이름\t직업";
		System.out.println(str2);
		
		String str3 = "자바\n스크립트";
		System.out.println(str3);
	}

}
