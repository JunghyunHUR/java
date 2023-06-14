package sec05.ch06;

public class ArrayExam01 {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		System.out.println("Scores[0] : " + scores[0]);
		System.out.println("Scores[1] : " + scores[1]);
		System.out.println("Scores[2] : " + scores[2]);
		
		//scores의 평균을 구하라.
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double rs = (double)sum/scores.length;
		System.out.println("총합 : " + sum);
		System.out.println("평균점수 : " + rs);

	}

}
