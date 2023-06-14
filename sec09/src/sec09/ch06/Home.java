package sec09.ch06;

public class Home  {
	//field 익명 구현 object 대입
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("turn on the Television");
		}
		@Override
		public void turnOff() {
			System.out.println("turn off the Television");
		}
	};
	
	//이용
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2() {
		RemoteControl rc2 = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("turn on the Air Conditioner");
			}
			@Override
			public void turnOff() {
				System.out.println("turn off the Air Conditioner");
			}
		};
		rc2.turnOn();
		rc2.turnOff();
	}
	
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
}
