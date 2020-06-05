package modifire;

public class Account {
	//private - 밖에서 볼 수 없게 한다
	private String accountNo;
	private String name;
	private int balance ;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String accountNo, String name, int balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
//	속성의 변경을 위해서 메소드를 제공
//	속성 값을 세팅하는 목적일 때는 set ~
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setName(String name) {
		this.name = name;
	}
//	속성 값을 가져 오는 목적일 때는 get ~
	public String getAccountNo() {
		return accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	
}
