package sec05.ch06;

public class ArrayExam05 {

	public static void main(String[] args) {
		
		int sum1 = add(new int[] {85, 88, 99, 75, 77});
		System.out.println(sum1);
			
		double avg = (double)sum1/5;	
		System.out.println(avg);
		if(avg >= 90) {
			System.out.println("A");
		}else {
			System.out.println("탈락");
		}
		
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
