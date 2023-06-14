package ch07.ex01;

public class CarExam {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + "HankookTire로 교체합니다.");
				car.tires[problemLocation - 1] = new HankookTire(car.tires[problemLocation - 1].location, 15);
			}
		}
		
//		for(int i = 1; i <= 6; i++) {
//			int problemLocation = car.run();
//			switch(problemLocation) {
//			case 1:
//				System.out.println("앞왼쪽 HankookTire로 교체");
//				car.frontLeftTire = new HankookTire("앞왼쪽", 10);
//			case 2:
//				System.out.println("앞오른쪽 HankookTire로 교체");
//				car.frontRightTire = new HankookTire("앞오른쪽", 9);
//			case 3:
//				System.out.println("뒤왼쪽 HankookTire로 교체");
//				car.backLeftTire = new HankookTire("뒤왼쪽", 10);
//			case 4:
//				System.out.println("뒤오른쪽 HankookTire로 교체");
//				car.backRightTire = new HankookTire("뒤오른쪽", 10);
//			}
//			
//		}
	}
}
