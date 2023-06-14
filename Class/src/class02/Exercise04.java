package class02;

import java.time.Instant;

public class Exercise04 {

	public static void main(String[] args) {
		long time = Instant.now().getEpochSecond();
		long y = time / 60 / 60 / 24 / 365;
		long d = (int)time / 60 / 60 / 24 % 365;
		System.out.println(y + "년 " + d + "일이 지났습니다.");
		
	}

}
