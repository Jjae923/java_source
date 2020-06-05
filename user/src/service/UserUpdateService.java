package service;

import domain.UserVO;
import persistence.UserDAO;

public class UserUpdateService {
	public int updateUser(UserVO vo){
		UserDAO dao = new UserDAO();
		return dao.updateUser(vo);
	}
	
//	public boolean updateUser(UserVO vo){
//		UserDAO dao = new UserDAO();
//		return dao.updateUser(vo)>0 ? true : false;
//	}
}
