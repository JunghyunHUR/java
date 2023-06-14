package ch03;

public class ResultCircle {

	public static void main(String[] args) {

		int r = 12;
		
		Calculator cal = new Calculator();
		System.out.println("원 면적 : " + cal.areaCircle(r));
		System.out.println();
		Computer com = new Computer();
		System.out.println("원 면적 : " + com.areaCircle(r));
		
	}

}
