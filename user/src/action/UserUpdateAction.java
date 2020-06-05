package action;

import java.util.Scanner;

import domain.UserVO;
import service.UserUpdateService;

public class UserUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {

		System.out.println("수정할 사용자 정보를 입력해주세요");
		System.out.print("번호 입력 : ");
		int no = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String address = sc.nextLine();
		
		UserVO vo = new UserVO();
		vo.setNo(no);
		vo.setAddress(address);
		
		UserUpdateService service = new UserUpdateService();
		
		System.out.println(service.updateUser(vo) > 0 ? "수정 성공":"수정 실패");

//		System.out.println(service.updateUser(vo)? "수정 성공":"수정 실패");  // true:false로 받을 경우
	}
}
