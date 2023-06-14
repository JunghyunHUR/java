package sec02.ch01;

public class VariableExam02 {

	public static void main(String[] args) {
		/*
		 * 리터럴 3, 5 를 대입하여 3시간 5분 출력
		 * 위 3시간 5분은 총 몇 분인지 출력
		 **/
		int h = 3;
		int m = 5;
		System.out.println(h + "시간" + m + "분");
		int totalM = h*60 + m;
		System.out.println(h+"시간"+m+"분은 총" + totalM+ "분이다");
		
		int num = 200;
		int num2 = 013; //8진법 //0206
		int num3 = 0xf; //16진법 //0x2a0f
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		
	}

}
