package sec03.ch03;

public class Ch03Exam13 {

	public static void main(String[] args) {
		int rs = 0;
		rs += 10;
		System.out.println(rs);
		
		rs -= 5;
		System.out.println(rs);
		
		rs *= 3;
		System.out.println(rs);
		
		rs /= 5;
		System.out.println(rs);
		
		
		rs %= 3;
		System.out.println(rs);

		int score = 75;
		char rs1 = (score >= 80) ? 'B' : 'C';
		char rs2 = (score >= 90) ? 'A' : rs1 ;
		System.out.println(rs2);
	}

}
