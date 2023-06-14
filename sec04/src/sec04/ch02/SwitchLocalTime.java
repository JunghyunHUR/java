package sec04.ch02;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SwitchLocalTime {

	public static void main(String[] args) {
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		
		//포멧 적용
		String nTime = nowTime.format(formatter);
		System.out.println(nTime);
		
		int hour = nowTime.getHour();
		int minute = nowTime.getMinute();
		int second = nowTime.getSecond();
		
		System.out.println(hour  + "시 " + minute + "분 " + second + "초");
		
		switch(hour) {
		case 9:
			System.out.println("출근 시간입니다.");
			break;
		case 17:
			System.out.println("퇴근 시간이 다 되어 갑니다.");
			break;
		case 18:
			System.out.println("퇴근 시간입니다.");
			break;
		default:
			System.out.println("그 외에는 관심 없습니다.");
		}

	}

}
