package exe01.num01;

public class EmployeeExam {
	
	public static void main(String[] args) {
		
		Employee em = new Employee();
		
		em.setName("홍길동");
		em.setJobtitle("대리");
		em.setSalary(5000);
		
		em.printEmployee();
		System.out.println("1년 후...");
		
		em.ralseSalary(10);
		em.printEmployee();
	}

}
