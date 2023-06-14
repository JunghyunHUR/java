package sec06.ch10;

public class Car {
	
	int speed;
	void run() {
		System.out.println("자동차가 " + speed + "km/h로 달립니다.");
	}
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		
	}

}
