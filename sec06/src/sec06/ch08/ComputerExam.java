package sec06.ch08;

public class ComputerExam {

	public static void main(String[] args) {
		Computer com = new Computer();
		int[] valA = {1,2,3};
		int rs1 = com.sum1(valA);
		System.out.println("rs1 : "+ rs1);
		
		int rs2 = com.sum1(new int[] {1,2,3,4,5});
		System.out.println("rs2 : " + rs2);
		
		int rs3 = com.sum2(1, 4, 6, 7, 11);
		System.out.println("rs3 : " + rs3);

	}

}
