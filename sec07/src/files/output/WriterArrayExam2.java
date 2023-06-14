package files.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterArrayExam2 {

	public static void main(String[] args) {

		try {
			
			OutputStream os = new FileOutputStream("C:/Junghyun/temp/sample3.db");
			
			byte[] array = {10, 20, 30, 40, 50, 60};
			
			os.write(array, 1, 3);
			
			os.flush();
			os.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
