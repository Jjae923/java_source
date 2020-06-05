package ch4;

public class AccountEx {
	public static void main(String[] args) {

		Account account = new Account("110-10-1000","홍길동",100000);
		
		
		// 입금한다
		System.out.println("현재 잔액 : "+account.deposit(200000));
		 // 출금한다
		System.out.println("현재 잔액 : "+account.withdraw(100000));
		
		

	}

}
