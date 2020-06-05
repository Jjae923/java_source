package ch4;

public class SubscriberInfo {
	// 가입자 정보 클래스
	// 이름(name) , 아이디(id), 비밀번호(pwd), 전화번호(tel), 주소(addr)
	String name;
	String id;
	String pwd;
	String tel;
	String addr;
	
	
	// 기본 생성자
	SubscriberInfo(){}
	// 인자를 모두 받는 생성자
	SubscriberInfo(String name,String id,String pwd,String tel,String addr){
//		this.name = name;
//		this.id = id;
//		this.pwd = pwd;
		this(name,id,pwd);
		this.tel = tel;
		this.addr = addr;
	}
	// 이름, 아이디, 비밀번호를 받는 생성자
	SubscriberInfo(String name,String id,String pwd){
		this.name = name;
		this.id = id;
		this.pwd = pwd;
	}
	
	// 기능
	// 비밀번호 변경(리턴값 없음 - 변경 비밀번호를 받아 현재 비밀번호 변경)
	void chpwd(String newpwd) {
		this.pwd = newpwd;
	}
	// 전화번호 변경(리턴값 없음 - 변경 전화번호를 받아 현재 전화번호 변경)
	void chtel(String newtel) {
		this.tel = newtel;
	}
	// 주소 등록(리턴값 없음 - 변경 주소를 받아 현재 주소 변경)
	void chaddr(String newaddr) {
		this.addr = newaddr;
	}
	
	@Override
	public String toString() {
		return "[name = "+name+", id = "+id+", pwd = "+pwd+", tel = "+tel+", addr = "+addr+"]";
	}
	
	
}
