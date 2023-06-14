package ch07.ex01;

public class KumhoTire extends Tire {

	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	//메소드
	@Override
	public boolean roll() {
		
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + "금호타이어 수명" + (maxRotation - accumulateRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "금호타이어를 교체하세요. ***");
			return false;
		}
	}
}
