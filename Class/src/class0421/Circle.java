package class0421;

public class Circle {
	int radius;
	double pi = Math.PI;
	
	void round(int radius) {
		this.radius = radius;
		System.out.println(radius*2*pi + "cm");
	}
	
	void area(int radius) {
		this.radius = radius;
		System.out.println(radius*radius*pi + "cm^2");
	}
}
