package files.output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExam {

	public static void main(String[] args) {
		
		try {
			
			InputStream ist = new FileInputStream("c:/Junghyun/temp/sample.db");
			while(true) {
				int data = ist.read(); // 1byte씩 읽기
				if(data == -1) break; // 파일 끝에 도달하면 루프 탈출
				System.out.println(data);
			}
			
			ist.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
