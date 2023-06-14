package sec13.ch01;

public class RentExam {
	
	public static void main(String[] args) {
		HomeRent homeRent = new HomeRent();
		Home home = homeRent.rent();
		home.turnOnLight();
		
		CarRent carRent = new CarRent();
		Car car = carRent.rent();
		car.run();
	}

}
