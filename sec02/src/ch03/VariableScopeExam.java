package ch03;

public class VariableScopeExam {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1 >10) {
			int v2 = v1 - 10;
		}
		/* int v3 = v1 + v2 +5; scope 안에 있는 변수는 scope 안에서만 사용가능
		 * 
		 */
		
		System.out.println();
		// 시스템으로, 출력하는데, 
		/*
		 * 1. println(내용); => 괄호안의 내용을 출력하고 행을 바꿔라.
		 * 2. print(내용); => 괄호안의 내용을 행을 바꾸지 않고 출력.
		 * 3. printf("형식문자열", 값1, 값2....);
		 * 
		 * % [argument_index$] [flags] [width] [.precision] conversion
		 * argument_index$ = 일련번호
		 * flags = -, 0
		 * width = 전체 자리수
		 * .precision = 소수점 자리수
		 * conversion = 변환문자 String => s, Number => d(정수) f(실수)
		 */
		
		System.out.printf("이름 : %1$-6s, 나이 : %2$d", "홍길동", 25);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f", 10, area);
		
		String name = "홍길동";
		String job = "도둑놈";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
