package sec03.ch03;

public class Ch03Exam12 {

	public static void main(String[] args) {
		// 논리곱, 논리합 연산
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		System.out.println("===>");
		System.out.println(toBinaryString(45&25));
		
	}
	
	private
	static String toBinaryString(int i) {
		String str = Integer.toBinaryString(i);
		while(str.length() < 32) {
			str = "0" +str;
		}
		return str;
	}

}
