package ch15;


public class Service {
	//필드 x
	//생성자 x
	//메소드 o
	@PrintAnnotation
	public void method1() {
		System.out.println("첫 번째 실행내용");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("두 번째 실행내용");
	}
	
	@PrintAnnotation(value = "#", number = 20)
	public void method3() {
		System.out.println("세 번째 실행내용");
	}
	
	public void method4() {
		System.out.println("네 번째 실행내용");
	}

	
}
