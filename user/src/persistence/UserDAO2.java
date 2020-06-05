package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.UserVO2;

// 클래스명 만드는 규칙
// ~~DAO(Data Access Object) : DB와 관련된 작업을 하는 클래스명
// ~~VO, ~~DTO : 값들을 객체로 처리하는 클래스명(바구니)
public class UserDAO2 {
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con=null;
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";  // localhost : 내 PC / 다른 사람 DB 끌고오려면 IP 기입
		
		String user="javadb";
		String password="12345";
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}//getConnection close
	
	public int insertUser(String username, String birthYear, String addr) {
		int result = 0;
		
		String sql = "insert into userTBL(username,birthYear,addr) values(?,?,?)";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {  // 미리보내서 DB서버가 파싱하고 실행계획 세우도록 함
			
			pstmt.setString(1, username);		// 1번 물음표에 이거 넣어줘
			pstmt.setString(2, birthYear);	// 2번 물음표에 이거 넣어줘
			pstmt.setString(3, addr);	// 3번 물음표에 이거 넣어줘
			
			result=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}//InsertUser close
	
	public UserVO2 getUserName(int no) {
		
		String sql="select * from userTBL where no=?";
		UserVO2 vo=null;
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setInt(1, no);
			
			//select
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) { // no는 PK이기 때문에 while문 없이 if로 
				vo=new UserVO2();
				vo.setNo(rs.getInt("no"));				// 번호로 지정해서 가져와도 되고 
				vo.setUserName(rs.getString("username"));		// 이렇게 명칭으로 가져와도 됨!
				vo.setBirthYear(rs.getInt("birthYear"));
				vo.setAddr(rs.getString("addr"));
			}	// 행을 하나 갖고 나올때는 이렇게
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}//getUser close
	
	public List<UserVO2> getList(){
		List<UserVO2> list = new ArrayList<UserVO2>();
		
		String sql="select * from userTBL";
		
		try(Connection con=getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			ResultSet rs=pstmt.executeQuery();

			while(rs.next()){
				UserVO2 vo=new UserVO2();		// 행이 여러개일 경우 매번 생성
				vo.setNo(rs.getInt("no")); 
				vo.setUserName(rs.getString("username"));
				vo.setBirthYear(rs.getInt("birthYear"));
				vo.setAddr(rs.getString("addr"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}//getList 종료
	
	public int updateUser(UserVO2 vo) { // insertUser처럼 매개변수 넣어서 받아도 되고 통째로 받아도되고 
		int result=0;
		String sql="update userTBL set addr=? where no=?";
		try(Connection con=getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setString(1, vo.getAddr());
			pstmt.setInt(2, vo.getNo());
			
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}//updateUser 종료

	public int deleteUser(int no) {
		int result=0;
		String sql="delete from userTBL where no=?";
		try(Connection con=getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setInt(1,no);
			
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}//deleteUser 종료
}
