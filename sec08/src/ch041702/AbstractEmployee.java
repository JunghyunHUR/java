package ch041702;

public abstract class AbstractEmployee {
	//필드 (상수)
	private String name;
	
	public AbstractEmployee() {}
	
	public AbstractEmployee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//추상 메소드
	public abstract void doWork();
}
