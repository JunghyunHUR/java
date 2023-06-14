package sec09.ch06;

public class HomeExam {
	public static void main(String[] args) {
		
		Home home = new Home();
		
		//익명 구현 객체 필드
		home.use1();
		
		//익명 구현 객체 로컬 변수
		home.use2();
		
		//익명 구현 객체 매개 변수
		home.use3(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("turn on the Gas");
			}
			@Override
			public void turnOff() {
				System.out.println("turn off the Gas");
			}
		});
		
	}
	

}
