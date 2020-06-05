package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLEx2 {
	public static void main(String[] args) {
		
		try {
			URL site = new URL("https://www.naver.com");
			URLConnection con = site.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));  // 보조스트림 + 보조스트림 + 사이트 정보 읽어오기
			
			String input;
			
			while((input=reader.readLine())!=null){
				System.out.println(input);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
