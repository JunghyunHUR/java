package sec04.ch02;

public class WhileKeyControlExam {
	
	public static void main(String[] args) throws Exception {
	boolean run = true;
	int speed = 0;
	int keyCode = 0;
	
	while(run) {
		if(keyCode == 13 && keyCode != 10) {
			System.out.println("***********************");
			System.out.println("1.가속 | 2.감속 | 3.중지");
			System.out.println("***********************");
			System.out.println("선택 : ");
		}
		
		keyCode = System.in.read();
		System.out.println(keyCode);
		
		if(keyCode == 49) { // 1 을 눌렀을때
			speed++;
			System.out.println("현재속도 = " + speed);
		}else if(keyCode == 50) {
			speed--;
			System.out.println("현재속도 = " + speed);
		}else if(keyCode == 51) {
			run = false;
		}
	
	}

	}

}
