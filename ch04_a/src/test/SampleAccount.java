package test;

public class SampleAccount {
//	1. 잔고(balance) 필드 - 외부에서 직접 접근 불가
	private int balance;

//	setBalance(int aount) 구현
//	balance 필드는 음수값이 될 수 없고
//	최대 백만원까지만 저장이 가능함
//	2. 음수값이거나, 백만원이 넘는다면 현재의 잔액을 유지
	public void setBalance(int amount) {
		if (amount >= 0 && amount <= 1000000) {
			this.balance = amount;
		}
	}

//	3. getBalance() → 현재 잔고 리턴
	public int getBalance() {
		return balance; // balance가 잔고를 가지고 있기 때문
	}

}
