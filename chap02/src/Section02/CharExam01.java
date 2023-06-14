package Section02;

public class CharExam01 {
	
	public static void main(String[] args) {
		char a =65;
		char a1 = 'A';
		char a2 = '\u0041';
		
		char b = '가';
		char b1 = 44032;
		char b2 = '\uAC00';
		
		int unicode = b;
		
		System.out.println(unicode);
				
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);

		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
	}

}
