package class01;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner q2_scan = new Scanner(System.in);
		Scanner q2_scan2 = new Scanner(System.in);
		Scanner q2_scan3 = new Scanner(System.in);
		int num1 = q2_scan.nextInt();
		int num2 = q2_scan2.nextInt();
		int num3 = q2_scan3.nextInt();
		
		double result = (double)(num1+num2+num3)/3;
		System.out.println("세 수의 평균 : " + result);

	}

}
