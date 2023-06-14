package files.output;

import java.io.FileReader;
import java.io.Reader;

public class ReadFileExam {
	
	public static void main(String[] args) throws Exception{
		
		Reader reader = null;
		
		reader = new FileReader("C:/Junghyun/temp/test.txt");
		
		while(true) {
			int data = reader.read();
			if(data == -1) break;
			System.out.print((char)data);
		}
		reader.close();
		System.out.println();
	}

}
