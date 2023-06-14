package class0406;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 a 입력 : ");
		int a = sc.nextInt();
		System.out.println("정수 b 입력 : ");
		int b = sc.nextInt();
		System.out.println("정수 c 입력 : ");
		int c = sc.nextInt();
		System.out.println("정수" + a + ", " + b + ", " + c + "의 최소값은 "  +min(a, b, c) + "입니다.");

	}

	static int min(int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		return min;
	}
}
