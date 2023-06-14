package class0406;

import java.util.Scanner;

public class Exer07 {

	//문자 C를 n개 표시하는 메소드
	static void putChar(char c, int n) {
		while(n-- > 0) {
			System.out.print(c);
		}
	}
	
	static void putStars(int n) {
		putChar('*', n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직각 삼각형 출력");
		System.out.println("단수를 입력하세요. >");
		
		int x = sc.nextInt();
		for(int i = 0; i < x; i++) {
			putStars(i);
			System.out.println();
		}
	}
}
