package class0403;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int[] y = new int[x];
		int m = 0;
		double avg = 0;
		double rs = 0;
		
		for(int i = 0; i < y.length; i++) {
		int score = scan.nextInt();
			y[i] = score;
			if(y[i] > m) {
				m = y[i];
			}
			
		}
		for(int i = 0; i < y.length; i++) {
			avg += (double)y[i]/m*100;
		}
		rs = avg/(y.length);
		System.out.println(rs);
		
		
	}

}
