package myweb.sec01;

import java.net.InetAddress;

public class InetAddressExam {

	public static void main(String[] args) throws Exception {
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내 컴퓨터의 IP주소 : " + local.getHostAddress());
		
		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		for(InetAddress remote : iaArr) {
			System.out.println("www.naver.com IP주소 : " + remote.getHostAddress());
		}

	}

}
