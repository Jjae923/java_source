package service;

import persistence.UserDAO;

public class UserDeleteService {
	public int deleteUser(int no){
		// dao의 deleteUser(no) 호출
		UserDAO dao = new UserDAO();
		return dao.deleteUser(no);
	}
}
