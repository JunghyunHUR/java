package sec10.ch11.exm01;

public class ExceptionHandleExam3 {

	public static void main(String[] args) {
		
		String[] array = {"100", "loo"};
		
		for(int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array {" + i + "} : " + value );
			}catch(NumberFormatException e){
				System.out.println("숫자로 변환 할 수 없음 : " + e.getMessage());
			}catch(IndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과함 : " + e.getMessage());
			}
		}
	}
}
