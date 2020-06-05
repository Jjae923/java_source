package modifire;

//import문이 들어오는 경우는 다름 패키지에 있는
//클래스를 호출하는 경우
import exam.Account_2;

public class AccountEx {
	public static void main(String[] args) {
		//Modifire
		Account_2 account = new Account_2();	
		//import는 해줄 수 있는데 new는 안된다고 말한다 - 해당 페이지에서 개방이 되지 않아서 사용 불가
		//생성자에 public이 붙지 않아서 데려올 수가 없었다
		//public 아무데서나 부를 수 있다
 		
	}
}
