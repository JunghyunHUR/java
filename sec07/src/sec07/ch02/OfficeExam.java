package sec07.ch02;

public class OfficeExam {

	public static void main(String[] args) {


		Employee im = new Employee();
		im.setName("임꺽정");
		im.setJobTitle("대리");
		System.out.println(im.toString());
		
		System.out.println("----------------");
		
		Manager mn = new Manager();
		mn.setName("홍길동");
		mn.setJobTitle("과장");
		mn.setManageJob("인사");
		System.out.println(mn.toString());
		
		ManagerB mm = new ManagerB();
		mm.setName("홍길동");
		mm.setJobTitle("과장");
		mm.setManagerJob("인사");
		System.out.println(mm.toString());

	}

}
