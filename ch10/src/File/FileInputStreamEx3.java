package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx3 {
	public static void main(String[] args) {
		
		// 이미지 파일을 읽어서 다른 이름으로 저장
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("d:\\temp\\picture.jpg");		// 이거를 읽어와서
			fos = new FileOutputStream("d:\\temp\\copy.jpg");		// 이거로 복사해줘
			byte b[] = new byte[1024];
			while(fis.read(b)!=-1) {
				fos.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
