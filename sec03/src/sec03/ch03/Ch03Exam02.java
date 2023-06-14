package sec03.ch03;

public class Ch03Exam02 {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1+1;
		
		System.out.println("십진수 : "+ v1);
		System.out.println("십진수 : "+ v2);
		System.out.println("십진수 : "+ v3);
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 +1;
		
		System.out.println(toBinaryString(v4) + "십진수 : "+ v4);
		System.out.println(toBinaryString(v5) + "십진수 : "+ v5);
		System.out.println(toBinaryString(v6) + "십진수 : "+ v6);
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value); // 정수값을 32비트 이진 문자열로 리턴하는 메소드
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}

}
