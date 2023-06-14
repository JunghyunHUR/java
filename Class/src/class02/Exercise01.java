package class02;

import java.time.Instant;
import java.util.Scanner;

public class Exercise01 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("화씨 온도를 입력하세요");
		System.out.print("> ");
		double fDeg = scan.nextDouble();
		double cDeg = (fDeg-32) / 1.8;
		
		System.out.println("섭씨온도 : " + cDeg);
		
	}

}
