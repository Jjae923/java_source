package Class;

public class Register_23 {
//	필드
	String userid;
	String name;
	String password;
	String mobile;
	String addr;
	
//	생성자
	public Register_23(String userid, String name, String password, String mobile, String addr) {
		super();
		this.userid = userid;
		this.name = name;
		this.password = password;
		this.mobile = mobile;
		this.addr = addr;
	}

	public Register_23() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Register_23(String userid, String name, String password) {
		super();
		this.userid = userid;
		this.name = name;
		this.password = password;
	}
}
