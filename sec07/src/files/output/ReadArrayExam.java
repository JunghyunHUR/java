package files.output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadArrayExam {

	public static void main(String[] args) {
		
		try {
			
			InputStream ist = new FileInputStream("c:/Junghyun/temp/sample.db");
			byte[] data = new byte[100]; //data 라는 100개의 원소를 가진 byte 배열을 만듦
			while(true) {
				int num = ist.read(data); // 1byte씩 읽기
				if(num == -1) break; // 파일 끝에 도달하면 루프 탈출
				
				for(int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
			}
			
			ist.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
