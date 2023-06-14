package files.output;

import java.io.FileWriter;
import java.io.Writer;

public class WriterFileExam {

	public static void main(String[] args) throws Exception {
		
		//문자기반 출력 스트림 생성
		Writer writer = new FileWriter("c:/Junghyun/temp/test.txt");
		
		char a = 'A';
		writer.write(a);
		
		char b = 'B';
		writer.write(b);
		
		//배열 출력
		char[] arr = {'C', 'D', 'E'};
		writer.write(arr);
		
		//String 출력
		writer.write("\nJames");
		
		writer.flush();
		writer.close();
		
		System.out.println("파일 생성 완료!");
	}
	
}
