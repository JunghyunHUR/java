package ch07;

public class MyCarExam {
	
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Car c = new Car();
		HybridCar h = new HybridCar();
		
		System.out.println("1");
		v.displayInfo();
		System.out.println("2");
		c.displayInfo();
		System.out.println("3");
		h.displayInfo();
		System.out.println("4");
		
		Vehicle c1 = new Car();
		Vehicle c2 = new HybridCar();
		Car c3 = new HybridCar();
		
		c1.displayInfo();
		System.out.println("5");
		c2.displayInfo();
		System.out.println("6");
		c3.displayInfo();
		
		/* 자식 객체로 부모 클래스 선언 불가
		 * 
		 * HybridCar c4 = new Vehicle();
		 * Car c5 = new Vehicle();
		 * */
	}

}
