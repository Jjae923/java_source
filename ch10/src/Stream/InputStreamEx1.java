package Stream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
		
		// 바이트 단위의 입력 담당 추상 클래스
		InputStream in = System.in; // System.in : 키보드에서 읽어올게
		
		try {
			int input = in.read();
			System.out.println((char)input);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// in.read() : 1btye씩 읽어오기 때문에 한글 입력하면 결과값 깨짐 => 한글은 적어도 2byte 필요
	}
}
