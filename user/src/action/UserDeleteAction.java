package action;

import java.util.Scanner;

import service.UserDeleteService;

public class UserDeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {

		sc.nextLine();
		
		// 삭제할 user 번호 받기
		System.out.println("삭제할 사용자 번호를 입력하세요");
		int result = sc.nextInt();

		// UserDeleteService 객체 delete 호출
		// 실행 후 결과를 받아 삭제 성공 혹은
		// 삭제 실패 메시지 출력하기
		UserDeleteService service = new UserDeleteService();
		
		System.out.println(service.deleteUser(result)>0?"삭제 성공":"삭제 실패");
	}
}
