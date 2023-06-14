package class02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("인치를 입력하세요.");
		System.out.print("> ");
		double inch = scan.nextDouble();
		double cm = inch * 2.54;
		System.out.println(cm + "cm");

	}

}
