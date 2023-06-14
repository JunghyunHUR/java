package sec07.ch02;

public class GalaxyPhone extends CellPhone{
	//필드
	boolean pen;
	
	//생성자;
	GalaxyPhone(String model, String color, boolean pen){
		this.model = model;
		this.color = color;
		this.pen = pen;
	}
	
	//메소드
	void turnOnPen() {
		System.out.println("갤럭시 " + model + "의 팬을 꺼냅니다.");
	}
	
	void drawPen() {
		System.out.println("갤럭시 " + model + "에 그림을 그립니다.");
	}
	
	void turnOffPen() {
		System.out.println("그리기를 중단하고 팬을 " + model + "에 넣습니다");
	}
}
