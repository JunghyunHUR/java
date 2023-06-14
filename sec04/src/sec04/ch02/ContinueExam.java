package sec04.ch02;

public class ContinueExam {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		int x = 0;
		for( int i = 1; i <=100; i++){
			if(i % 3 != 0){
				continue;
			}
			x += i;
		}
		System.out.println(x);
	}

}
