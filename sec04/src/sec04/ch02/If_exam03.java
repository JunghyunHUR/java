package sec04.ch02;

public class If_exam03 {
	
	public static void main(String[] args) {
		
		int dice = (int)(Math.random()*6)+1;// 강제 타입변화
//		System.out.println(dice);
		if(dice == 1) {
			System.out.println("1번이 나왔습니다");
		}else if(dice == 2) {
			System.out.println("2번이 나왔습니다");
		}else if(dice == 3) {
			System.out.println("3번이 나왔습니다");
		}else if(dice == 4) {
			System.out.println("4번이 나왔습니다");
		}else if(dice == 5) {
			System.out.println("5번이 나왔습니다");
		}else {
			System.out.println("6번이 나왔습니다");
		}
	}

}
