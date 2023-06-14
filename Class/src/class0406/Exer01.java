package class0406;

import java.util.Scanner;

public class Exer01 {
	
	//method
	static int SignOf(int n) {
		int sign = 0;
		if(n > 0) {
			sign = 1;
		}else if(n < 0) {
			sign = -1;
		}
		return sign;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 > ");
		int x = sc.nextInt();
		
		int s = SignOf(x);
		System.out.println(s);
	}

}
