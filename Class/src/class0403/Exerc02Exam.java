package class0403;

import java.util.Scanner;

public class Exerc02Exam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //과목수 선언
		int A[] = new int[N]; // 과목수 만큼 배열 생성
		
		for(int i = 0; i < N; i ++) {
			A[i] = sc.nextInt();
		}
		long sum = 0;
		long max = 0;
		for(int i = 0; i < N; i++) {
			if(A[i] > max) max = A[i];
			sum += A[i];
		}
		
		System.out.println("원래평균 : " + sum / N);
		System.out.println("사기 평균 : " + sum * 100 / max / N);
		

	}

}
