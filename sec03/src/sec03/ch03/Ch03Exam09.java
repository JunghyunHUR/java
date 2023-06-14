package sec03.ch03;
import java.util.*;

public class Ch03Exam09 {

	public static void main(String[] args) {
		
		//NaN, Infinity = Double type
		
		double dmoney = 1000000.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금액을 입력하세요.");
		String InputData = scanner.nextLine();
		double newmoney = Double.valueOf(InputData);
		if(Double.isNaN(newmoney)) {
			System.out.println("NaN이 입력되어 처리가 불가능 합니다");
			newmoney = 0.0;
		}
		double totalmoney = dmoney + newmoney;
		System.out.println(newmoney + "를 입금하셨습니다");
		System.out.println("현재 통장 잔고는" + totalmoney + "원 입니다.");

	}

}
