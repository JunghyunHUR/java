package class0406;

import java.util.Scanner;

public class Exer06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int month;
		do{
			System.out.println("몇 월 입니까? (1 ~ 12)");
			month = sc.nextInt();
		}while(month < 1 || month > 12);
		
		System.out.print("해당 월의 계절은 ");
		printSeason(month);
		System.out.println("입니다.");
	}
	
	static void printSeason(int m) {
		switch(m) {
		case 1: case 2: case 12:
			System.out.print("겨울");
			break;
		case 3: case 4: case 5:
			System.out.print("봄");
			break;
		case 6: case 7: case 8:
			System.out.print("여름");
			break;
		case 9: case 10: case 11:
			System.out.print("가을");
			break;
		}
	}

}
