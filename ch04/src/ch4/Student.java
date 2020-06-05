package ch4;

public class Student {
	
	int grade;      // 학년 - 1,2,3 ...
	String name;    // 이름 - 홍길동
	String mobile;  // 핸드폰 번호 - 01012345678
	String addr;    // 주소 -서울, 대구 ...
	
	
	// 생성자 오버로딩   // 오버로딩 : 하나의 클래스에 동일한 이름으로 여러가지가 존재하는 것 (메소드 오버로딩 등)
	Student(){}
	Student(int grade,String name,String addr){
		this.grade = grade;
		this.name = name;
		this.addr = addr;
	}	
	Student(int grade,String name,String mobile,String addr){
//		this.grade = grade;
//		this.name = name;
//		this.mobile = mobile;
		this(grade,name,mobile);    // this(내가 가지고있는 생성자)
		this.addr = addr;           // this.내가 가지고있는 필드, 메소드
	}
}
