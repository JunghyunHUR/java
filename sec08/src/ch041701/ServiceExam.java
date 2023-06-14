package ch041701;

public class ServiceExam {

	public static void main(String[] args) {
		
		//인터페이스 변수 선언, 구현 객체 대입
		Service sc = new ServiceImpl();
		
		//default method 호출
		sc.defaultMethoad1();
		System.out.println();
		sc.defaultMethoad2();
		System.out.println();
		
		//static method 호출
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();

	}

}
