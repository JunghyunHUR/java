package sec02.ch01;

public class VariableExam03 {
	public static void main(String[] args) {
		int num = 0b1011; //2진수는 앞에 0b, 0B를 붙인다.
		int num2 = 0206;
		int num3 = 365; //8진수는 앞에 0을 붙인다.
		int num4 = 0xb3; //16진수는 앞에 0x, 0X를 붙인다.
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		long number = 20;
		long number2 = 3000000000L; //long 타입을 선언할때 int의 한도를 넘는수는 뒤에 l, L을 붙인다.
		System.out.println(number + " " + number2);
		
		//java '' ""는 구별해야 한다.
		//char c = ''; 불가능 char c = ' '; 가능 string c = ""; 가능
		
		char c1 = 'A';
		char c2 = 65;
		char c3 ='가';
		char c4 = 44032;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
