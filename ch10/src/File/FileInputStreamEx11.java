package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

//FileInputStreamEx1 finally 부분 변형
public class FileInputStreamEx11 {
	public static void main(String[] args) {		
		// jdk7버전 : try-with-resources
		try(FileInputStream fis=new FileInputStream(new File("d:\\temp\\test.txt"));
				OutputStream out=System.out) {			
			byte b[]=new byte[100];
			while(fis.read(b)!=-1) {
				out.write(b);
			}
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} 
//		finally {
//			try {
//				fis.close();
//				out.close();
//			} catch (IOException e) {				
//				e.printStackTrace();
//			}
//		}
	}
}







