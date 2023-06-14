package class06;

public class Printer {

	int num;
	boolean bool;
	double db;
	String str;
	
	void println(int num) {
		this.num = num;
		System.out.println(num);
	}
	
	void println(boolean bool){
		this.bool = bool;
		System.out.println(bool);
	}
	void println(double db) {
		this.db = db;
		System.out.println(db);
	}
	void println(String str) {
		this.str = str;
		System.out.println(str);
	}
}
