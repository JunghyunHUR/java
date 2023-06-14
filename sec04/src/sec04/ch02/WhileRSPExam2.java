package sec04.ch02;
import java.util.Scanner;
import java.util.Random;

public class WhileRSPExam2 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Random rd = new Random();
		boolean game = true;
		String rs = "";
		String rs2 = "";
		String r = "바위";
		String s = "가위";
		String p = "보";
		
		while(game) {
			System.out.println("가위바위보 게임을 시작합니다.\n 다음 번호를 입력하세요.");
			System.out.println("|1.가위|\t2.바위|\t3.보|\t4.끝내기|");
			int user = scan.nextInt();
			int com = rd.nextInt(3)+1;
			if(user == 1) {
				rs=s;
			}else if(user == 2) {
				rs = r;
			}else {
				rs = p;
			}
			if(com == 1) {
				rs2 = s;
			}else if(com == 2) {
				rs2 = r;
			}else {
				rs2 = p;
			}
			if(user > 3 || user < 1) {
				System.out.println("게임을 종료 합니다.");
				game = false;
			}else {
				switch(user){
				case 1:
					if(com ==1) {
						System.out.println("비겼습니다");
					}else if(com == 2) {
						System.out.println("졌습니다");
					}else {
						System.out.println("이겼습니다");
					}
					break;
				case 2:
					if(com ==1) {
						System.out.println("이겼습니다");
					}else if(com == 2) {
						System.out.println("비겼습니다");
					}else {
						System.out.println("졌습니다");
					}
					break;
				case 3:
					if(com ==1) {
						System.out.println("졌습니다");
					}else if(com == 2) {
						System.out.println("이겼습니다");
					}else {
						System.out.println("비겼습니다");
					}
					break;
				}
			}
			
			
			
		}

	}

}
