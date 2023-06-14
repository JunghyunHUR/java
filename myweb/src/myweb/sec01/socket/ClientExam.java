package myweb.sec01.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExam {

	public static void main(String[] args) {
		try {
			
			//socket 생성과 동시에 localhost 4000으로 연결 요청
			Socket socket = new Socket("localhost", 4000);
			System.out.println("[클라이언트] 연결 성공");
			
			//socket 닫기
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
			
		}catch(UnknownHostException e) {
			//IP표기 방법이 잘못될 경우 발생하는 에러
		}catch(IOException e) {
			//해당 포트 서버에 연결이 안될 때
		}

	}

}
