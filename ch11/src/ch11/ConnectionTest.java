package ch11;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	public static void main(String[] args) {
		
		try {
			// 드라이버 로드 (→MySQL 서버랑 연동시켜주는 드라이버_MySQL버전마다 드라이버 이름 다를 수 있음)
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/javadb?"	// localhost : 내 컴퓨터(IP주소로 대체될 수 있음) / 3306 : MySQL 고유 포트번호
				+ "useSSL=false&serverTimezone=UTC";		// URL 또한 버전에 따라 달라짐 (뒷부분)
		
		String user = "javadb";
		String password = "12345";
		
		// 연결(Connection) 생성
		try(Connection con = DriverManager.getConnection(url, user, password)) {
			if(con!=null) {
				System.out.println("연결되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
