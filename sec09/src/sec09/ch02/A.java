package sec09.ch02;

public class A {

	//인스턴스 멤버 클래스
	static class B{
		//인스턴스 필드
		int field1 = 1;
		
		//정적 필드 (JAVA 17 부터 사용 가능)
		static int field2 = 2;
		
		//생성자
		B(){
			System.out.println("B-생성자 실행");
		}
		
		// instance method
		void method1() {
			System.out.println("B-method1 실행");
		}
		
		// static method (JAVA 17 부터 사용 가능)
		static void method2() {
			System.out.println("B-method2 실행");
		}
		
	}
}
