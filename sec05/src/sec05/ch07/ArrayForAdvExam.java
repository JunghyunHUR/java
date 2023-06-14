package sec05.ch07;

public class ArrayForAdvExam {

	public static void main(String[] args) {
		int[] scores = {88, 95, 70, 80, 99, 100};
		int sum = 0;
//		for(int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
		for(int score : scores) {
			sum += score;
		}
		System.out.println("점수총합 = " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("평균 = " + avg);
	}
}
