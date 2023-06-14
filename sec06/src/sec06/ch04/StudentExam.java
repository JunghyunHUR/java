package sec06.ch04;

public class StudentExam {

	public static void main(String[] args) {
		Student hong = new Student();
		Student kim = new Student();
		Student lee = new Student();
		
		hong.name = "홍길동";
		hong.mobile = "010-1234-1234";
		
		kim.name = "김철수";
		kim.mobile = "010-2222-3333";
		
		lee.name = "이승만";
		lee.mobile = "010-2223-4444";
		
		hong.absent();
		hong.absent();
		
		kim.comeLate();
		
		lee.leaveEarly();
		
		System.out.println(hong.name + "은 결석을" + hong.absentSum + "번 했습니다.");
		System.out.println(kim.name + "는 지각을" + kim.comeLateSum + "번 했습니다.");
		System.out.println(lee.name + "은 조퇴를" + lee.leaveEarlySum + "번 했습니다.");

	}

}
