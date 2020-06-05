package inherit;

public class CheckingTrafficCardAccountEx {
	public static void main(String[] args) throws Exception {
		
		CheckingTrafficCardAccount traffic1 = new CheckingTrafficCardAccount("111-11", "홍길동", 1000000, "222-22", true);
		
		// 예금한다
		traffic1.deposit(100000);
		System.out.println("현재 잔액 : "+traffic1.getBalance());
		
		// 출금한다
		traffic1.withdraw(50000);
		System.out.println("현재 잔액 : "+traffic1.getBalance());
		
		// 직불카드 사용액을 지불한다
		traffic1.pay("222-22", 100000);
		
		// 교통카드 사용액을 지불한다
		System.out.println(traffic1.payTrafficCard("222-22", 2500));
		
		
		
		CheckingTrafficCardAccount traffic2 = new CheckingTrafficCardAccount("111-11", "홍길동", 1000000, "222-22", false);
		
		// 교통카드 사용액을 지불한다
		System.out.println(traffic2.payTrafficCard("333-22", 3500));
		
	}

}
