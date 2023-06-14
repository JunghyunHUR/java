package class0403;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int num = scan.nextInt();
		int rs = 0;
		
		String y = Integer.toString(num);
		int[] z = new int[y.length()];
		for (int i = 0; i < y.length(); i++) {
			z[i] = y.charAt(i) - '0';
		}
		
		
		for(int i = 0; i < x; i++) {
			rs += z[i];
			
		}
		System.out.println(rs);

	}

}
