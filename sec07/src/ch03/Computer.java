package ch03;

public class Computer extends Calculator{

	double areaCircle(double r) {
		System.out.println("컴퓨터의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
