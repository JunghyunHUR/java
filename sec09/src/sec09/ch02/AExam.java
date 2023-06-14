package sec09.ch02;

public class AExam {

	public static void main(String[] args) {
		
		//B 객체 생성 및 인스턴스 필드, 메소드 사용방법
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		
		//B 정적 필드, 메소드
		System.out.println(A.B.field2);
		A.B.method2();

	}

}
