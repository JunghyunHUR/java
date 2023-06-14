package sec04.ch02;

public class ForTriangleExam {

	public static void main(String[] args) {
		String output = "";
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				output += " ";
			}
			for(int k = 0; k < 2*i+1; k++) {
				output += "*";
			}
			output += "\n";
			
		}System.out.println(output);
		
	}

}
