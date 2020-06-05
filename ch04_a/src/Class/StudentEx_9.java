package Class;

public class StudentEx_9 {
	
	Student_8 student1 = new Student_8(2, "홍길동", "01062352215", "서울");
						//생성자 호출 () 아무것도 없으면 기본생성자를 부른다
	Student_8 student2 = new Student_8();
						//오류를 없애려면 다른 쪽에 가서 기본생성자를 입력해야 한다(Student_8에 Student_8(){} 생성)
	Student_8 student3 = new Student_8(3, "성춘향", "강원");
	
}
