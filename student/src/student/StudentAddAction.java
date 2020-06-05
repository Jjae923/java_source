package student;

import java.util.Scanner;

public class StudentAddAction implements Action {
	
	@Override
	public void execute(Scanner sc) {
		
		sc.nextLine();
		System.out.println("---- 새로운 학생 정보 입력 ----");
		System.out.print("학  번 : ");
		int no = sc.nextInt();
		System.out.print("이  름 : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("학  년 : ");
		int grade = sc.nextInt();
		System.out.print("생  일(예시 : 05/11) : ");
		sc.nextLine();
		String birth = sc.nextLine();
		
		StudentAddService service = new StudentAddService();
		
		System.out.println(service.insert(no, name, grade, birth)? name+" 학생 정보가 입력되었습니다." : name+" 학생 정보가 입력되지않았습니다." );
		System.out.println();
	}
}
