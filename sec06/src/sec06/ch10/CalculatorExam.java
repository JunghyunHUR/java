package sec06.ch10;


public class CalculatorExam {
	String myCal = "공학용 계산기";

	public static void main(String[] args) {
		
		/*
		 * 같은 클래스 안에 있다 하더라도 정적 메소드에서 인스턴스 필드를
		 * 사용하시 위해서는 클래스가 선언되어 객체가 생성되어야 한다.
		 */
		CalculatorExam c = new CalculatorExam();
		
		System.out.println(Calculator.pi);
		System.out.println(Calculator.plus(20, 15));
		System.out.println(Calculator.minus(17, 13));
		

	}

}
