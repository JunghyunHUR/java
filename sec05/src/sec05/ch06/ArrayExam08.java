package sec05.ch06;

public class ArrayExam08 {

	public static void main(String[] args) {
		String subject = "자바 프로그램";
		int index = subject.indexOf("프로그램");
		System.out.println(index);
		String cut = subject.substring(0, index);
		System.out.println(cut);

		int index2 = subject.indexOf("자바");
		if(index2 == -1) {
			System.out.println("자바와 관련없는 책");
		}else {
			System.out.println("자바와 관련된 책");
		}
		
		boolean bool = subject.contains("자바");
		
		if(bool) {
			System.out.println("자바와 관련된 책");
		}else {
			System.out.println("자바와 관련없는 책");
		}
		
		String java = "1, 자바, 학습, 참조 타입 String 을 공부합니다., 홍길동";
		String[] j = java.split(", ");
		
		String num = "번호: " + j[0];
		String title = "제목: " + j[1];
		String content = "내용: " + j[2] + ", " + j[3];
		String name = "이름: " + j[4];
		
		System.out.println(num + '\r' + title + '\r' + content + '\r' + name);
		
		
	}

}
