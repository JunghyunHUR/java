package sec07.ch02;

public class Manager {
	
	//필드
	private String name;
	private String jobTitle;
	private String manageJob;
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getManageJob() {
		return manageJob;
	}

	public void setManageJob(String manageJob) {
		this.manageJob = manageJob;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append("|");
		sb.append(jobTitle);
		sb.append("|");
		sb.append(manageJob);
		
		return sb.toString();
	}

}
