package sec04.ch02;

import java.util.Scanner;

public class If_exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력 하세요");
		int score = sc.nextInt();
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("A+");
			}else {
				System.out.println("A");
			}
			
		}else if(score >=80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
