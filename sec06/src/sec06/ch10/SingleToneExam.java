package sec06.ch10;

public class SingleToneExam {

	public static void main(String[] args) {
//		SingleTone obj = new SingleTone();
		SingleTone obj = SingleTone.getInstance();
		SingleTone obj2 = SingleTone.getInstance();
		
		if(obj == obj2) {
			System.out.println("같은 SingleTone 객체 입니다.");
		}else {
			System.out.println("다른 SingleTone 객체 입니다.");
		}

	}

}
