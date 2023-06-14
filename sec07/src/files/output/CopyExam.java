package files.output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExam {

	public static void main(String[] args) throws Exception{
		
		
		String img1 = "C:/Junghyun/temp/001.jpg";
		String img2 = "C:/Junghyun/temp/002.jpg";
		
		//입출력 스트림 생성
		InputStream orImg = new FileInputStream(img1);
		OutputStream newImg = new FileOutputStream(img2);
			
		//읽은 데이터를 저장할 배열 생성
//		byte[] data = new byte[1024];
//		
//		while(true) {
//			// 최대1024바이트를 읽어 배열에 저장, 읽은바이트는 리턴
//			int num = orImg.read(data); 
//			// 파일을 다 읽으면 break
//			if(num == -1) break;
//			// 읽은 바이트 수 만큼 출력
//			newImg.write(data, 0, num);
//		}
		orImg.transferTo(newImg);
			
		newImg.flush(); // 내부 버퍼의 잔류 바이트를 출력하고 버퍼를 비움
		orImg.close(); // 읽은 파일을 닫음
		newImg.close(); // 쓴 파일을 닫음
			
		System.out.println("파일 복사 완료");
		
		
		
	}
}
