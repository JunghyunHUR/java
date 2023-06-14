package exe01.num01;

public class RectangleExam {
	
	public static void main(String[] args) {
	
		Rectangle rectangle = new Rectangle(7, 12);
		
		System.out.println("넓이는 : " + rectangle.getArea());
		System.out.println("둘레는 : " + rectangle.getPerimeter());
		
		rectangle.setWidth(16);
		rectangle.setHeight(8);
		
		System.out.println("수정된 넓이는 : " + rectangle.getArea());
		System.out.println("수정된 둘레는 : " + rectangle.getPerimeter());
	}

}
