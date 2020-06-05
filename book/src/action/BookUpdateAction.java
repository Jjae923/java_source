package action;

import java.util.Scanner;
import domain.BookVO;
import service.BookUpdateService;

public class BookUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 사용자로부터 code를 입력받고
		System.out.println("가격 수정할 도서의 코드를 입력해주세요");
		System.out.print("도서 코드 입력 : ");
		String code = sc.nextLine();
		System.out.print("수정 가격 입력 : ");
//		int price = sc.nextInt();
//		sc.nextLine();
		int price = Integer.parseInt(sc.nextLine()); // 한 줄로 가능
		
		// 해당하는 도서 가격 수정하기
		BookVO vo = new BookVO();
		vo.setCode(code);
		vo.setPrice(price);
		
		BookUpdateService service = new BookUpdateService();
		
		System.out.println(service.updateBook(vo) > 0 ? "수정 성공":"수정 실패");
	}
}
