package myRest;

public class HelloBean {
	//field
	private String name = "헬로빈";
	
	//construct
	public HelloBean() {}
	
	//method
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
