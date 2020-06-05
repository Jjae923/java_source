package Class;

public class AccountEx_17 {
	public static void main(String[] args) {
		
		Account_16 account = new Account_16("110-10-1000", "동길동", 100000);
		
		//예금한다
		System.out.println("현재잔액 : " + account.deposit(200000));
		//출금한다
		System.out.println("현재잔액 : " + account.withdraw(100000));
	}
}
