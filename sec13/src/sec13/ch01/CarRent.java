package sec13.ch01;

public class CarRent implements Rentable<Car> {

	@Override
	public Car rent() {
		return new Car();
	}
}
