package Reader;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderEx2 {
	public static void main(String[] args) {
		try(FileReader reader = new FileReader("d:\\temp\\test.txt");
			FileWriter writer = new FileWriter("d:\\temp\\test15.txt",true)) {
			char[] b = new char[100];	// char단위로 처리하기때문에 char배열 사용
			while((reader.read(b))!=-1) {
				writer.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
