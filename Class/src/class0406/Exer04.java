package class0406;

import java.util.Scanner;

public class Exer04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 x까지의 합을 구압니다. x를 입력하세요.");
		
		int x;
		do {
			System.out.println("x를 입력하세요. > ");
			x = sc.nextInt();
			
		}while(x <= 0);
		System.out.println("1부터 " + x + "까지 더한 결과는 " + sumB(x) + "입니다.");
	}
	
	static int sumB(int n) {
		int sum = 0; //합이 들어갈 변수
		for(int i = 1; i <= n ; i++) {
			sum += i; //sum에 i를 계속 더함.s
		}
		return sum; // 더한결과를 return
	}

}
