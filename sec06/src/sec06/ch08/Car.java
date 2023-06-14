package sec06.ch08;

public class Car {
	//필드
	int gas;
	boolean key;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 아직 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("자동차가 달립니다.(gas 잔량 : " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("가스가 떨어져 자동차가 멈춤니다. (gas 잔량 : " + gas + ")");
				return;
			}
		}
	}
	void key(boolean key) {
		this.key = key;
	}
	boolean keyTurnOn() {
		if(key == false) {
			System.out.println("시동이 꺼졌습니다.");
			return false;
		}
		System.out.println("시동이 걸렸습니다.");
		return true;
	}

}
