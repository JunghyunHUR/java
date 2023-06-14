package sec03.ch03;

public class Ch03Exam07 {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean rs1 = (num1 == num2);
		boolean rs2 = (num1 != num2);
		boolean rs3 = (num1 <= num2);
		
		System.out.println(rs1);
		System.out.println(rs2);
		System.out.println(rs3);
		
		char c1 = 'A';
		char c2 = 'B';
		boolean rs4 = (c1 < c2);
		System.out.println(rs4);
		
		int v1 = 1;
		double v2 = 1.0;
		System.out.println(v1 == v2);
		
		double v3 = 0.1;
		float v4 = 0.1f;
		System.out.println(v3 == v4); //false
		System.out.println((float)v3 == v4); // true
		System.out.println((int)(v3*10) == (int)(v4*10)); //true
		
	}

}
