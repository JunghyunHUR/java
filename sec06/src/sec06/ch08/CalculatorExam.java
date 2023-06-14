package sec06.ch08;

public class CalculatorExam {

	public static void main(String[] args) {
		//생성
		Calculator myCalc = new Calculator("노랑색", "초딩용");
		
		myCalc.color = "노랑색";
		myCalc.type = "초딩용";
		System.out.println(myCalc.color + " " + myCalc.type + "계산기가 있습니다");
		
		myCalc.powerOn();
		
		byte x = 10;
		byte y = 4;
		
		double rs = myCalc.divide(x, y);
		System.out.println(x + " 을 " + y + " 로 나눕니다.");
		System.out.println("계산 결과는 " + rs + "입니다.");
		
		myCalc.powerOff();
	}

}
