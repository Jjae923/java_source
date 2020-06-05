package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		OutputStream out = null;
		try {
			fis = new FileInputStream(new File("d:\\temp\\test.txt"));
			out = System.out;
			byte b[] = new byte[100];
			while(fis.read(b)!=-1) {
				out.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {		// InputStream과 OutputStream은 통로 같은거라서 계속 잡고 있으면 공간 차지하여 비효율적이기 때문에 finally로 없애는거
			try {
				fis.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
