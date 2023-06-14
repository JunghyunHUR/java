package class0421;

public class Rectangle {
	int width;
	int height;
	
	void area(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println(height * width);
	}
	void round(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println((width + height) *2);
	}
}
