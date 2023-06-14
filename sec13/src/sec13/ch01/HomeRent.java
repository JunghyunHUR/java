package sec13.ch01;

public class HomeRent implements Rentable<Home> { //Type Parameter of interface to Home

	@Override
	public Home rent() { // return type must be Home
		return new Home();
	}
	
}
