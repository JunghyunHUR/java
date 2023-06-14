package sec07.ch02;

public class PhoneExam {

	public static void main(String[] args) {
		
		//GalaxyPhone 객체 생성
		GalaxyPhone galaxyPhone = new GalaxyPhone("S22울트라", "핑크", true);
		
		//CellPhone 에서 상속받은 필드
		System.out.println("모델 : " + galaxyPhone.model);
		System.out.println("컬러 : " + galaxyPhone.color);
		
		//CellPhone 에서 상속받은 메소드
		galaxyPhone.powerOn();
		galaxyPhone.bell();
		galaxyPhone.sendVoice("여보세요?");
		galaxyPhone.receiveVoice("안녕하세요! 저는 홍길동입니다. 나라를 훔치려고 해요.");
		galaxyPhone.sendVoice("헛소리 하지 말고 끊으세요.");
		galaxyPhone.hangUp();
		
		//GalaxyPhone 필드 pen이 true이면 GalaxyPhone 메소드 호출
		if(galaxyPhone.pen == true) {
			galaxyPhone.turnOnPen();
			galaxyPhone.drawPen();
			galaxyPhone.turnOffPen();
		}

	}

}
