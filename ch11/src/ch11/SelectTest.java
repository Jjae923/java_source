package ch11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectTest {
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
		String sql = "select * from userTBL";
		try(Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = con.prepareStatement(sql)) {  // PreparedStatement : sql문을 담아서 DB와 연동하는 객체   / Statement은 무조건 sql과 관련
			if(con!=null) {
				ResultSet rs = pstmt.executeQuery();  // ResultSet이라는 table에 sql문 결과값을 담아줘 / executeQuery() : select구문일 때 사용
				while(rs.next()) {	// 행 읽어오는 메소드(=next())를 루프에 담았음
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getDate(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
