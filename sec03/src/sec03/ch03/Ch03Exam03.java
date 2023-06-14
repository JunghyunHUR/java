package sec03.ch03;

public class Ch03Exam03 {

	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 200000000);
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 계산식을 종료합니다.");
		}
		
		
	}
	public static int safeAdd(int left, int right) {
		if(right > 0) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}else {
			if(left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("언더플로우 발생");
			}
		}
		return left + right;
	}

}
