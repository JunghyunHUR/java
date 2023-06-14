package sec09.ch05;

public class CarExam {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		//익명 자식객체가 대입된 필드 사용
		car.run1();
		
		//익명 자식객체가 대입된 로컬변수 사용
		car.run2();
		
		//익명 자식객체가 대입된 매개변수 사용
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("정말 많이도 굴러갑니다. ~~~");
			}
		});
		
	}

}
