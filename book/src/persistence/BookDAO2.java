package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.BookVO;

public class BookDAO2 {
	static {
		try {
			// 드라이버 클래스 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// Connection 처리
	public Connection getConnection() {
		Connection con=null;
		
		String url="jdbc:mysql://localhost:3306/javadb?"
				+ "useSSL=false&serverTimezone=UTC";
		String user="javadb";
		String password="12345";
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}	
	
	// 도서 정보 입력
	public int insertBook(BookVO vo) {
		int result=0;
		
		String sql = "insert into bookTBL(code,title,writer,price) values(?,?,?,?)";
		
		try(Connection con=getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql)) {
				pstmt.setString(1, vo.getCode());
				pstmt.setString(2, vo.getTitle());
				pstmt.setString(3, vo.getWriter());
				pstmt.setInt(4, vo.getPrice());
				
				result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// 도서 정보 조회
	public BookVO getRow(String code){	// 물읍표에 해당하는 거 매개변수에 넣어주기
		String sql="Select * from bookTBL where code=?";  // where로 여러 결과값을 가져올때(PK아닌경우) 리턴값은 무조건 List<>
		BookVO vo=null;
		try(Connection con=getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setString(1, code);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new BookVO();
				vo.setCode(rs.getString("code"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setPrice(rs.getInt("price"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
}
 







