package ch11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTest {
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
		
		String sql = "update userTBL set address='서울시 구로구' where no=5";
		
		// 연결(Connection) 생성
		try(Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt=con.prepareStatement(sql)) {
			if(con!=null) {
				// insert,delete,update 쿼리문 실행
				int result = pstmt.executeUpdate(); // 보낸거.실행() : 잘된 행의 수(int)로 체크해서 보냄 / 1 : 성공 , 0 : 실패
				if(result>0) {
					System.out.println("업데이트 성공");
				}else {
					System.out.println("업데이트 실패");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
