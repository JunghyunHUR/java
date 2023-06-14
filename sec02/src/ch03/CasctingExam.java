package ch03;

public class CasctingExam {

	public static void main(String[] args) {
		int intValue = 103029770; 
		byte byteValue = (byte) intValue;
		System.out.println(byteValue);

		intValue = 65;
		char charValue = (char)intValue;
		System.out.println(charValue); // A 출력
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue); //정수 부분만 저장
		
		//자바가 성능향상을 위해 컴파일 단계에서 리터럴 계산식은 미리 수행한다.
		byte result = 10+30;
		System.out.println(result);
		
		int x = 1;
		int y = 2;
		double rs = (double)x / (double)y;
		System.out.println(rs);
		
	}

}
