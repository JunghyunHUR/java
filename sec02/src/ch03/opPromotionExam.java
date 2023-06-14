package ch03;

public class opPromotionExam {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println(result1); //컴파일 단계에서 계산이 완료
		
		byte v1 = 10;
		byte v2 = 20;
		int rs2 = v1 + v2;
		System.out.println(rs2); // 정수형 변수의 계산은 int 타입으로저장된다.
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long rs3 = v3 + v4 + v5; //long type으로 받는다.
		System.out.println(rs3);
		
		char v6 = 'A';
		char v7 = '가';
		int rs4 = v6 + v7;
		
		System.out.println(rs4);
		System.out.println((char) rs4);
		
		int v8 = 10;
		int rs5 = v8 / 4;
		System.out.println(rs5);
		
		int v9 = 10;
		double rs6 = v9 / 4.0;
		System.out.println(rs6);
		
		int v10 = 1;
		int v11 = 2;
		double rs7 = (double) v10/v11;
		System.out.println(rs7);
		
		String str = "1";
		Boolean n = Boolean.parseBoolean(str);
		System.out.println(n);
		
		/*
		 * java는 true 와 false가 따로 마련되어 있다.
		 * 즉, 1 = true, 0 = false 가 아니다.
		 * true false
		 * 
		 * 기본 타입을 문자열로 변경 : String str = String.valueOf(기본타입변수);
		 */
	}

}
