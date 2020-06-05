package test;

public class Member {
	String name; //이름 : name (문자열)
	String id; //아이디 : id (문자열)
	String password; //비밀번호 : password (문자열)
	int age;  //나이 : age(정수)
	
	//생성자 : name과 id필드를 받아서 초기화
	public Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	//login(String id, String password) 메소드
	boolean login(String id, String password){
	//전달인자로 id,password를 전달받아 id가 hong 이고
	//password가 12345 인 경우 true 리턴
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
	//조건에 맞지 않으면 false리턴
		return false;
	}
	//logout() 메소드
	//로그아웃 되었습니다 라는 메세지를 출력
	void logout(){
		System.out.println("로그아웃 되었습니다.");
	}
}





