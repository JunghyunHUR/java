package class0406;

import java.util.Scanner;

public class Exer09 {
	
	static Scanner sc = new Scanner(System.in);
	
	// 양의 정수값을 읽어서 반환하는 메소드
	static int readPlusInt() {
		int x;
		do {
			System.out.println("양의 정수값");
			x = sc.nextInt();
			
		}while(x <= 0);
		return x;
	}
	
	
	public static void main(String[] args) {
		int x;
			int n = readPlusInt();
			System.out.println("반대로 읽으면");
			
			while(n > 0) {
				System.out.print(n % 10); //n의 마지막 자릿수
				n /= 10;
			}
			System.out.println("입니다");
	}

}
