package sec05.ch07;

public class ArrayCopyExam02 {

	public static void main(String[] args) {
		String[] oldStr = {"java", "html", "css"};
		String[] newStr = new String[6];
		
		System.arraycopy(oldStr, 0, newStr, 0, oldStr.length);
		
		for(int i = 0; i < newStr.length; i++) {
			System.out.print(newStr[i]+", ");
		}

	}

}
