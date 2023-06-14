package sec06.ch10;

public class Television {

	static String company = "LG";
	static String model = "OLED";
	static String info;
	static int oneSumTen;
	static {
		info = company + " - " + model;
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		oneSumTen = sum;
	}
}
