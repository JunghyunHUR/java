package sec04.ch02;

public class ForEachExam {
	
	public static void main(String[] args) {
		String[] numbers = {"one", "two", "three", "four", "five"};
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		for(String num : numbers) {
			System.out.println(num);
		}
	}

}
