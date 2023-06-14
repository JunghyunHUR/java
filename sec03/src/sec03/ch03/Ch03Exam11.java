package sec03.ch03;

public class Ch03Exam11 {

	public static void main(String[] args) {
		String st1 = "홍길동";
		String st2 = "홍길동";
		String st3 = new String("홍길동");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println("++++++++++++++++++++++++");
		System.out.println(st1 == st2);
		System.out.println(st2 == st3);
		System.out.println(st1 == st3);
		System.out.println("++++++++++++++++++++++++");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st2.equals(st3));
	}
	
}
