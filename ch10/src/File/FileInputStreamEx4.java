package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx4 {
	public static void main(String[] args) {
		
		// 음악 파일을 읽어서 다른 이름으로 저장
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("d:\\temp\\rolling.mp3");			// 이거를 읽어와서
			fos = new FileOutputStream("d:\\temp\\copyrolling.mp3");	// 이거로 복사해줘
//			byte b[] = new byte[1024];
//			while(fis.read(b)!=-1) {
//				fos.write(b);
//			}
			int data;
			long start = System.currentTimeMillis();
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("걸린 시간 : "+(end-start));
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
