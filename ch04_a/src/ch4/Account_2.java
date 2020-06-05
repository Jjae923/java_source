package ch4;
//복사본
public class Account_2 {
//	필드 - 계좌번호(accountNo), 이름(name), 잔액(balance)
	
//	기능 - 예금한다(deposit) / 출금하다(withdraw)
//	입금할 금액 / 출금금액을 입력받아 현재 잔액에
//	더하거나 빼기
	
	String accountNo;
	String name;
	int balance;
		
	public Account_2() {}
	public Account_2(String accountNo, String name, int balbace) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	   
	int deposit(int amount) {
			  //입금액 입력받아온다
		return balance += amount;
		
	}
	int withdraw(int amount) {
		return balance =+ amount;
	}
}
