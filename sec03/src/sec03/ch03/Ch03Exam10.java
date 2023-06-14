package sec03.ch03;
import java.util.Scanner;

public class Ch03Exam10 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in); //입력을 받는 부분
		System.out.println("알파벳을 입력하세요.");
		String sc = scn.nextLine(); //입력을 받아 String 타입변수 sc에 저장
		char var = sc.charAt(0); //저장된 String타입을 char타입으로 변환
		String txt;
		if(var >= 65 & var <= 90) {
			txt = "대문자";
		}else if(var >= 97 & var <= 122){
			txt = "소문자";
		}else if(!(var < 48) && !(var > 57)) {
			txt = "숫자";
		}else {
			txt = "알파벳이나 숫자가 아닙니다";
		}
		System.out.println("입력한 문자는" + txt + "입니다.");
		
		int value = 6;
		if(value % 2 == 0 || value % 3 == 0) {
			System.out.println(value + "은(는) 2 또는 3의 배수입니다.");
		}else {
			System.out.println(value + "은(는) 2 또는 3의 배수가 아닙니다.");
		}
		
	}
}
