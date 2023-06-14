package ch03;

public class PrintExam {

	public static void main(String[] args) {
		int val = 123;
		System.out.printf("상품의 가격: %d원\n", val);
		System.out.printf("상품의 가격: %6d원\n", val);
		System.out.printf("상품의 가격: %-6d원\n", val);
		System.out.printf("상품의 가격: %06d원\n", val);

	}

}
