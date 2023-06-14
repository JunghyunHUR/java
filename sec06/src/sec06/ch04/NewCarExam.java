package sec06.ch04;

public class NewCarExam {

	public static void main(String[] args) {
		//Car 객체를 생성
		NewCar myCar = new NewCar();
		
		//NewCar의 필드값을 읽어보자
		System.out.println("모델명 : " + myCar.model);
		System.out.println("사용여부 : " + myCar.start);
		System.out.println("현재속도 : " + myCar.speed + "km/h");
		
		myCar.model = "현대자동차";
		
		

	}

}
