package sec05.ch07;

public class ArrayCopyExam {

	public static void main(String[] args) {
		int[] oldArray = {1, 2, 3};
		int[] newArray = new int[5];
		
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		for(int j = 0; j < newArray.length; j++) {
			System.out.print(newArray[j]+" ,");
		}
	}
}
