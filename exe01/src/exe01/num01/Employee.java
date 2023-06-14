package exe01.num01;

public class Employee {
	private String name;
	private String jobtitle;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void ralseSalary(double per) {
		salary = salary + salary * per / 100;
	}
	
	public void printEmployee() {
		System.out.println("이름 : " + name);
		System.out.println("직책 : " + jobtitle);
		System.out.println("월급 : " + salary);
	}
}
