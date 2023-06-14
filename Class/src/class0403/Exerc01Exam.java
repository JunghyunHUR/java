package class0403;

import java.util.Scanner;

public class Exerc01Exam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //갯수를 확인
		String sNum = sc.next(); // 입력값을 받음
		
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		for(int i = 0; i < cNum.length; i++) {
			sum = cNum[i] - '0';
		}
		System.out.println(sum);
	}
}
/*
 * String num
 * 정수형 변환 : Integer.paseInt(num); // Integer.valueOf(num);
 * 실수형 변환 : Double.paseDouble(num); // Double.valueOf(num);
 * 
 * int i = 12345;
 * String si = String.valueOf(i);
 * 
 * */