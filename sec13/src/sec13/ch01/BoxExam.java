package sec13.ch01;

public class BoxExam {
	
	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		// == Box<String> box1 = new Box<String>();
		
		box1.content = "안녕하세요?";		//자동타입변환 필요없음
		String content = box1.content;	// 강제타입변환 필요없음
		
		System.out.println(content);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 1546;
		int val = box2.content;
		
		System.out.println(val);
		
		
	}

}
