package sec04.ch02;
import java.util.*;

public class WhileScannerExam {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while (run){
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("선택 >");
			int user = scanner.nextInt();
			if(user == 1) {
				System.out.println("예금을 선택하셨습니다.");
				int plus = scanner.nextInt();
				balance += plus;
				System.out.println(plus+"원을 입금하셨습니다.");
				System.out.println("총 금액은 "+balance+"원 입니다.");
			}else if(user == 2) {
				System.out.println("출금을 선택하셨습니다.");
				int minus = scanner.nextInt();
				balance -= minus;
				System.out.println(minus + "원을 출금하셨습니다.");
				System.out.println("남은 금액은 "+balance+"원 입니다.");
			}else if(user == 3) {
				System.out.println("잔고 : " + balance);
			}else {
				run = false;
			}
		}
		System.out.println("프로그램 종료");


	}

}
