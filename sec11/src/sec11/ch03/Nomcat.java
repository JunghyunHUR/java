package sec11.ch03;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Nomcat {
	
	private static ServerSocket serverSocket = null;
	
	public static void main(String[] args) {
		System.out.println("------------------------------");
		System.out.println("서버를 종료하려면 q또는 Q를 입력하세요");
		System.out.println("------------------------------");
		
		//서버시작
		startServer();
		
		//키보드에 q를 입력하면 서버 종료
		Scanner sc = new Scanner(System.in);
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		sc.close();
		stopServer();
		
	}
	
	public static void startServer() {
		//작업스레드 정의
		/*
		 * thread => 프로세스에서 실제로 작업을 수행하는 주체
		 * 모든 프로세스는 한 개 이상의 thread가 존재한다.
		 * 두 개 이상의 thread를 갖고 있는것을 multiThread process라고 한다.
		 */
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//서버소켓 생성 및 포트 바인딩
					serverSocket = new ServerSocket(8081);
					System.out.println("서버 시작됨.");
					
					while(true) {
						System.out.println("\n [서버] 연결 요청을 기다림 \n");
						//연결 수락
						Socket socket = serverSocket.accept();
						
						//연결된 클라이언트의 정보 열기
						InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
						System.out.println("서버 : " + isa.getHostName() + "의 연결 요청을 수락함");
						
						//연결 끊음
						socket.close();
						System.out.println("서버 : " + isa.getHostName() + "의 연결을 끊음");
					}
					
				}catch(IOException e) {
					System.out.println("서버 " + e.getMessage());
				}
			}
		};
		//스레드 시작
		thread.start();
	}
	
	
	
	public static void stopServer() {
		try {
			//ServerSocket 닫고 Port 인바인딩
			serverSocket.close();
			System.out.println("서버 종료됨.");
			
		}catch(IOException e){
			
		}
		
	}
	
}
