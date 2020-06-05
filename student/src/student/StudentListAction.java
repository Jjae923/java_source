package student;

import java.util.List;
import java.util.Scanner;

public class StudentListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		
		StudentListService service = new StudentListService();
		List<StudentVO> list = service.getList();
		
		System.out.println("---- 학생 정보 보기 ----");
		System.out.println("학 번    이 름    학 년");

		for(StudentVO vo:list) {
			System.out.print(vo.getNo()+"    ");
			System.out.print(vo.getName()+"    ");
			System.out.println(vo.getGrade()+"     \n");
		}
	}
}
