package ch7;

import java.io.IOException;

public class FinallyEx2 {
	public static void main(String[] args) {

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("new.txt");
		}catch (FileInputStreamException e) {
			e.printStackTrace();
		}finally { // exception 발생하든지 안하든지 무조건 실행되는 블럭
			try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		try(FileInputStream in=new FileInputStream("tile.txt")){
			
		} catch(Exception e) {
			
		}
	}

}
