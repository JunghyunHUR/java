package sec11.ch01;

public class ExException01 {
	
	//실행 메소드에서도 예외를 떠넘기면 JVM이 최종적으로 예외처리를 한다.
	public static void main(String[] args) throws ClassNotFoundException {
		findClass();
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
