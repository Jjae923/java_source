package test;

public class SampleAccountEx {
	public static void main(String[] args) {
		SampleAccount account = new SampleAccount();

		account.setBalance(100000);
		System.out.println("현재 잔고 : " + account.getBalance());

		account.setBalance(-100000);
		System.out.println("현재 잔고 : " + account.getBalance());

		account.setBalance(15000000);
		System.out.println("현재 잔고 : " + account.getBalance());
	}

}
