package class0406;

import java.util.Scanner;

public class Exer03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 a 입력 : ");
		int a = sc.nextInt();
		System.out.println("정수 b 입력 : ");
		int b = sc.nextInt();
		System.out.println("정수 c 입력 : ");
		int c = sc.nextInt();
		System.out.println("정수" + a + ", " + b + ", " + c + "의 중간값은 "  +mid(a, b, c) + "입니다.");

	}

	static int mid(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a <= c) {
				return a;
			}else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}else {
			return b;
		}
		
	}

}
