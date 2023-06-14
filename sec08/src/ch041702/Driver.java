package ch041702;

public class Driver extends Employee implements Drivable {
	//필드
	private String carNo; //관리하는 차 번호
	
	//생성자
//	public Driver() {}
	public Driver(String name, String jobTitle, String carNo) {
		super(name, jobTitle);
		this.carNo = carNo;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Override
	public void drive() {
		System.out.println(this.getName() + "사원이 운전합니다.");
	}
	@Override
	public void transport() {
		System.out.println(this.getName() + " 사원이 물건을 운송합니다.");
	}
	
}
