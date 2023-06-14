package sec09.ch05;

public class Car {

	//field에 Tire object 대입
	private Tire tire1 = new Tire();
	
	//field에 익명 자식객체 대입
	private Tire tire2 = new Tire() {
		
		@Override
		public void roll() {
			System.out.println("익명 자식객체의 tire2가 굴러갑니다.");
		}
	};
	
	//method
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		//Local 변수로 익명객체
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식객체의 tire3이 굴러 갑니다.");
			}
		};
		tire.roll();
	}
	public void run3(Tire tire) {
		tire.roll();
	}
}
