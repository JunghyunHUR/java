package class0403;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] num = new int[n];
		
		for(int i = 0; i < num.length; i++) {
			int z = scan.nextInt();
			num[i] = z;
			
		}
		
		System.out.println(num);
		
		
		
		

	}

}
