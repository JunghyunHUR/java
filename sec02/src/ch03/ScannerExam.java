package ch03;

import java.util.Scanner; // java util 에서 Scanner를 import

public class ScannerExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner를 생성해서 변수에 담는다.
//		String inputData = scanner.nextLine(); //Scanner를 이요해 키보드 값을 읽는다.
		
//		System.out.print("x 값 입력 : ");
//		String strX = scanner.nextLine();
//		int x = Integer.parseInt(strX);
//		
//		System.out.print("y값 입력 : ");
//		String strY = scanner.nextLine();
//		int y = Integer.parseInt(strY);
//		
//		int result = x+y;
//		System.out.println("x + y = " + result);
//		System.out.println("++++++++The End++++++++");
		
		while(true) {
			System.out.print("문자를 입력하세요 : ");
			String str = scanner.nextLine();
			if(str.equals("q")) {
				System.out.println("Java를 정지합니다.");
				break;
			}
			System.out.println(str);
			System.out.println();
		}
	}

}
