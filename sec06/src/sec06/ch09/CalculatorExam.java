package sec06.ch09;

public class CalculatorExam {

	public static void main(String[] args) {
		
		double rs3 = 10 * 10 * Calculator.pi;

		Calculator myCalc = new Calculator();
		
		//정사각형 넓이
		double rs1 = myCalc.areaRect(15);
		//직사각형 넓이
		double rs2 = myCalc.areaRect(18, 22);
		
		System.out.println("정사각형의 넓이 : " + rs1);
		System.out.println("직사각형의 넓이 : " + rs2);
		System.out.println("rs3 : "+rs3);

	}

}
