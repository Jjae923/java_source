package ui;

import java.util.List;

import domain.UserVO2;
import persistence.UserDAO2;

public class UserOracle {
	public static void main(String[] args) {
		
		UserDAO2 dao = new UserDAO2();

		//연결됐는지 확인
//		Connection con = dao.getConnection();
//		
//		if(con!=null) {
//			System.out.println("데이터베이스 연결");
//		}
		
		// 전체 내용 가져오기
		List<UserVO2> list = dao.getList();
		for(UserVO2 vo:list) {
			System.out.println(vo);
		}
		
		
		

	}
}
