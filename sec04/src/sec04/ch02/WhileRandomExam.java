package sec04.ch02;

public class WhileRandomExam {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			System.out.println(num + ", " + num2);
			if(num+num2 == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");

	}

}
