package sec06.ch10;

public class MymemberExam {

	public static void main(String[] args) {
		Mymember inst1 = Mymember.getInstance();
		Mymember inst2 = Mymember.getInstance();
		
		System.out.println(inst1);
		System.out.println(inst2);
		
		System.out.println("인스턴스가 같은가?");
		System.out.println(inst1 == inst2);
		
		//getter setter 사용
		
		System.out.println(inst1.getId());
		System.out.println(inst1.getName());
		
		System.out.println(inst2.getId());
		System.out.println(inst2.getName());
	}

}
