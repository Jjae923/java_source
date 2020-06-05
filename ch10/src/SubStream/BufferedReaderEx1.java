package SubStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {
	public static void main(String[] args) {
		
		try(InputStreamReader fis = new InputStreamReader(new FileInputStream("d:\\temp\\test.txt"), "ms949");	// 보조스트림은 여러개 붙일 수 있음
			BufferedReader bis = new BufferedReader(fis);
			FileWriter fos = new FileWriter("d:\\temp\\test17.txt");
			BufferedWriter bos = new BufferedWriter(fos)) {
			
			String str;
			while((str=bis.readLine())!=null) { // readLine() : BufferedReader 안에 있는 메소드, 줄 단위로 읽어옴★
				bos.write(str);
				bos.newLine();
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
