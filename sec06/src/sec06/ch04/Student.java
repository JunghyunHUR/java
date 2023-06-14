package sec06.ch04;

public class Student {
	String name; // 이름
	String mobile; // 휴대폰 번호
	int absentSum; // 결석누계
	int comeLateSum; // 지각누계
	int leaveEarlySum; // 조퇴누계
	
	//결석하다
	void absent() {
		absentSum += 1;
	}
	//지각하다
	void comeLate() {
		comeLateSum += 1;
	}
	void leaveEarly() {
		leaveEarlySum += 1;
	}
}
