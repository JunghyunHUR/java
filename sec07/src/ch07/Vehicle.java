package ch07;

public class Vehicle {
	int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void displayInfo() {
		System.out.println("------ VEHICLE 정보 -------");
		System.out.println("speed : " + speed);
	}
}
