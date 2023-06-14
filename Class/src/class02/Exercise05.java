package class02;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		System.out.print("> ");
		int x = scan.nextInt();
		System.out.print("> ");
		int y = scan.nextInt();
		
		int plus = x + y;
		int minus = Math.abs(x - y);
		int mul = x * y;
		double avg = plus / 2;
		System.out.println(x + " + " + y + " = " + plus);
		System.out.println(x + " - " + y + " = " + minus);
		System.out.println(x + " * " + y + " = " + mul);
		System.out.println("평균 : " + avg);
		System.out.println("큰 수 : " + Math.max(x, y));
		System.out.println("작은 수 : " + Math.min(x, y));

	}

}
