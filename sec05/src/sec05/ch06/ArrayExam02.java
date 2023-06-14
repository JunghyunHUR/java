package sec05.ch06;

public class ArrayExam02 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {75, 88, 68};
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);

	}

}
