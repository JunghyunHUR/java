package myweb.sec01.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExam {
	
	private static ServerSocket serverSocket = null;
	
	public static void main(String[] args) {
		
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하시고 Enter를 누르십시오!");
		
		//TCP 서버 시작
		startServer();
		
		//키보드에서 q 받기
		Scanner sc = new Scanner(System.in);
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		sc.close();
		//서버 종료
		stopServer();
	}
	
	public static void startServer() {
		//스레드 정의
		Thread thread =  new Thread() {
			@Override
			public void run() {
				try {
					// ServerSocket 생성 및 Port 바인딩
					serverSocket = new ServerSocket(4000);
					System.out.println("[서버]가 시작되었습니다.");
					
					while(true) {
						System.out.println("\n 연결 요청을 기다림 \n");
						//연결 수락
						Socket socket = serverSocket.accept();
						
						//연결된 클라이언트 정보
						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println("[서버]" + isa.getHostName() + "의 연결 요청을 수락함");
						
						//연결 끊기
						socket.close();
						System.out.println("[서버]" + isa.getHostName() + "의 연결을 끊음");
						
					}
				}catch(IOException e) {
					System.out.println("[서버]" + e.getMessage());
				}
			}
		};
		thread.start();
	}
	
	public static void stopServer() {
		// ServerSocket을 닫고 Port 언바인딩
		
		try {
			serverSocket.close();
			System.out.println("[서버]가 종료 되었습니다.");
		}catch(IOException e){
			
		}
	}

}
