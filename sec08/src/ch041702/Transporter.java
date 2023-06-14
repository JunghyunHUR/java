package ch041702;

public class Transporter implements Drivable {
	private String carNo;

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	@Override
	public void drive() {
		System.out.println("배달원이 운전합니다.");
	}
	@Override
	public void transport() {
		System.out.println("배달원이 물건을 운송합니다.");
	}
}
