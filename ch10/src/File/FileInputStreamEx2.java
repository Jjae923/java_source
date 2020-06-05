package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream out = null;
		try {
			fis = new FileInputStream(new File("d:\\temp\\test.txt"));
			out = new FileOutputStream("d:\\temp\\result.txt");			// 파일로 쓰는건 한글 가능
			byte b[] = new byte[100];
			while(fis.read(b)!=-1) {
				out.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
