package ch04;

public class DriveAirplane {
	
	public static void main(String[] args) {
		SuperSonicAirplane  ss = new SuperSonicAirplane();
		
		ss.takeOff();
		ss.fly();
		ss.flyMode = SuperSonicAirplane.SUPERSONIC;
		ss.fly();
		ss.flyMode = SuperSonicAirplane.NORMAL;
		ss.fly();
		ss.land();
		
	}

}
