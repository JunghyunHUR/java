package sec06.ch07;

public class CarExam {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		Car myCar2 = new Car("쏘나타");
		Car myCar3 = new Car("그랜저", "검정색");
		Car myCar4 = new Car("투싼", "흰색", 200);
		
		System.out.println("회사명 : " + myCar1.company);
		System.out.println();
		System.out.println("회사명 : " + myCar2.company);
		System.out.println("모델명 : " + myCar2.model);
		System.out.println();
		System.out.println("회사명 : " + myCar3.company);
		System.out.println("모델명 : " + myCar3.model);
		System.out.println("색깔 : " + myCar3.color);
		System.out.println();
		System.out.println("회사명 : " + myCar4.company);
		System.out.println("모델명 : " + myCar4.model);
		System.out.println("색깔 : " + myCar4.color);
		System.out.println("최대속도 : " + myCar4.maxSpeed + "km/h");

	}

}
