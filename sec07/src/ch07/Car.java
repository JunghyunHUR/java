package ch07;

public class Car extends Vehicle {
	int oil;

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}
	
	//vehicle 재정의
	@Override
	public void displayInfo() {
		System.out.println("------ Car 정보 --------");
		System.out.println("speed : " + speed);
		System.out.println("oil : " + oil + "L");
	}
}
