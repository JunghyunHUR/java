package sec07.ch02;

public class ManagerB extends Employee{
	
	//필드
	private String managerJob;

	public String getManagerJob() {
		return managerJob;
	}

	public void setManagerJob(String managerJob) {
		this.managerJob = managerJob;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append("|");
		sb.append(this.getJobTitle());
		sb.append("|");
		sb.append(managerJob);
		
		return sb.toString();
	}
}
