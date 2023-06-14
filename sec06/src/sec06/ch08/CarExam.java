package sec06.ch08;

public class CarExam {
	
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(10); // gas 10 주유 - Car의 setGas() 메소그 호출
		boolean isGas = myCar.isLeftGas(); // 가스가 있는지 확인
		if(isGas) {
			System.out.println("출발합니다.");
			myCar.run(); // Car의 run() 호출해서 출발 시킨다.
		}
		if(!myCar.isLeftGas()) {
			System.out.println("gas를 주입해 주세요.");
		}
	}

}
