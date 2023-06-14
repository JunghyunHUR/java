package sec02.ch01;

public class VariableExam04 {
	public static void main(String[] args) {
		
		//정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		
		System.out.println("float:" + var1); //유효 소수점 자리 7자리
		System.out.println("douible:" + var2); // 유효 소수점 자리 15자리
		
		//숫자
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
//		int var6 = 3e6;
		
		System.out.println("double:" + var3);
		System.out.println("float:" + var4);
		System.out.println("double:" + var5);
	}
	
}
