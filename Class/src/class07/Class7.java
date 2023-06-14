package class07;

public class Class7 {
	
	public void putChar(int num) {
		String c = "c";
		for(int i = 0; i <= num; i ++) {
			System.out.print(c);
		}
		System.err.println();
	}
	public void putStart(int num) {
		String s = "*";
		for(int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public void Triangle(int num) {
		String s = "";
		for(int i = 0; i < num; i ++) {
			s += "*";
			System.out.println(s);
		}
	}
	

}
