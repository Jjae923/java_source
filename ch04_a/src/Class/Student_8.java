package Class;

public class Student_8 {
	int grade;		//학년 - 1,2,3...
	String name;	//이름 - 홍길동
	String mobile;	//핸드폰 번호 = 01062352215,
	String addr;	//주소 - 서울, 대구...
//	→ 생성자를 만들지 않으면 기본적인 default 기본생성자는 자동으로 생성
	
	Student_8(int grade, String name, String mobile, String addr) {	//default 생성자
//		this.grade = grade;
//		this.name = name;
//		this.mobile = mobile;
		//한줄로 변경
		this(grade,name,mobile);	//this(같은 타입의, 다른 것을, 가져온다)
		
		this.addr = addr;			//this.내가 가지고 있는 것을 = 가져온다;
	}
	
	Student_8() {}
	
	Student_8(int grade, String name, String addr) {	//default 생성자
			//또 만들경우 타입 위치를 변경시켜줘야 생성 가능
		this.grade = grade;
		this.name = name;
		this.addr = addr;
	}
	
	//생성자(컨스트락터)	: 오버로딩 여러 생성자가 있는 경우
	//오버로딩	: 하나의 클래스에 동일한 이름으로 여러개가 존재 하는 경우
	//ex)생성자에 썼기 때문에 생성자 오버로딩, 메소드에 쓰면 메소드 오버로딩
}
