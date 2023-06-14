package sec09.ch01;

public class A {

	// 인스턴스 멤버 클래스
	/*
	 * 
	 *  public class B{} --> 다른 패키지에서 B클래스 사용 가능
	 *  class B{} --> 같은 패키지에서만 B클래스 사용 가능
	 *  private class B{} --> A클래스 내부에서만 사용 가능
	 */
	class B{
		//필드
		int field1 = 1;
		
		//정적필드
		static int field2 = 2;
		
		//생성자
		B(){
			System.out.println("B-생성자 실행");
		}
		
		//method
		void method1() {
			System.out.println("B-메소드 실행");
		}
		
		//static method
		static void method2() {
			System.out.println("B-메소드2 실행");
		}
		
	}	
	
	//인스턴스 메소드
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
	}
	void useB2() {
		System.out.println(B.field2);
		B.method2();
	}
	
}
