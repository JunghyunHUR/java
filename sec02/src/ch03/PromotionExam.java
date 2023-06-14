package ch03;

public class PromotionExam {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드는 " + intValue + "입니다.");
		
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		float floatValue = 100.5F;
		System.out.println(floatValue);
		doubleValue = floatValue;
		System.out.println(doubleValue);
		
	}
}
