package class02;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("0 에서 1000 사이의 정수를 입력하세요.");
		
		boolean run = true;
		while(run) {
			System.out.print("> ");
			int num = scan.nextInt();
			int num1 = num % 10;
			int num2 = (num / 10) % 10;
			int num3 = ((num / 10) / 10) % 10;
			int num4 = ((num / 10) / 10) / 10 ;
			int rs = num1 + num2 + num3 + num4;
			
			if(num > 1000) {
				System.out.println("1000 이상의 수 입니다.");
				System.out.println("다시 입력하세요.");
			}else {
				System.out.println(rs);
				run = false;
			}
		}
		

	}

}
