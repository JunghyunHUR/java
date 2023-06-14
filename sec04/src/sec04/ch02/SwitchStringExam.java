package sec04.ch02;

import java.util.Scanner;

public class SwitchStringExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("직책을 입력하세요.");
		String scn = sc.nextLine();
		
		switch(scn) {
			case "부장":
				System.out.println("600만원이 입금되었습니다.");
				break;
			case "과장":
				System.out.println("400만원이 입금되었습니다.");
				break;
			default :
			System.out.println("800만원이 입금되었습니다.");
		}

	}

}
