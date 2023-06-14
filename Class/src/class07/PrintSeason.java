package class07;

public class PrintSeason {
	
	void printSeason(int x) {
		if(x == 12 || x == 1 || x == 2) {
			System.out.println("겨울");
		}else if(x == 3 || x == 4 || x == 5) {
			System.out.println("봄");
		}else if(x == 6 || x == 7 || x == 8) {
			System.out.println("여름");
		}else if(x == 9 || x == 10 || x == 11) {
			System.out.println("가을");
		}else {
			System.out.println("12달 안에 없습니다.");
		}
	}

}
