package ch041702;

public class Employee extends AbstractEmployee{
	//필드
//	private String name;
	private String jobTitle;
	
	//생성자
	public Employee(String name, String jobTitle) {
		super(name);
		this.jobTitle = jobTitle;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append(" | ");
		sb.append(jobTitle);
		
		return sb.toString();
	}
	
	@Override
	public void doWork() {
		System.out.println("열심히 일합니다.");
	}
}
