package inherit;

public class CheckingAccountEx {
	public static void main(String[] args) throws Exception {
		
		CheckingAccount checkingAccount = new CheckingAccount("111-11", "홍길동", 1000000, "222-22");
				
		// 입금한다
		checkingAccount.deposit(500000);
		System.out.println("현재 잔액 : "+checkingAccount.getBalance());
		
		// 출금한다
		checkingAccount.withdraw(100000);
		System.out.println("현재 잔액 : "+checkingAccount.getBalance());
		
		// 체크카드 사용액을 지불한다
		// 카드번호가 일치하는 경우
		System.out.println(checkingAccount.pay("222-22", 200000));
		
		// 카드번호가 불일치하는 경우
		System.out.println(checkingAccount.pay("333-22", 2000000));
				
		
	}

}
