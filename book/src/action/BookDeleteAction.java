package action;

import java.util.Scanner;

import service.BookDeleteService;

public class BookDeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 사용자로부터 code를 입력받고
		System.out.print("도서 코드 입력 : ");
		String code = sc.nextLine();

		// 해당하는 도서 정보 삭제하기
		BookDeleteService service = new BookDeleteService();
		
		System.out.println(service.deleteBook(code)>0?"삭제 성공":"삭제 실패");
	}
}
