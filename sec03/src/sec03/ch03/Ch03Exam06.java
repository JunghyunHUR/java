package sec03.ch03;

public class Ch03Exam06 {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x%y;
		
		//Infinity = 
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z+2);
		}
	}
}
