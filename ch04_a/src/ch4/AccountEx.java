package ch4;

public class AccountEx {
	public static void main(String[] args) {
//		Account 배열객체 생성	
		Account_2 account[] = new Account_2[3];	//빈방 3개 생성

		account[0] = new Account_2("112-12", "홍길동", 10000);
		account[1] = new Account_2("112-13", "홍자반", 20000);
		account[2] = new Account_2("112-14", "홍쟁이", 30000);
		
		for (int i = 0; i < account.length; i++) {
			System.out.println(account[i].accountNo + "\t");
			System.out.println(account[i].name + "\t");
			System.out.println(account[i].balance + "\n");
		}
		System.out.println();
		
		//향상된 for문
		for (Account_2 acc : account) {	//acc 새로 생성
			System.out.println(acc.accountNo + "\t");
			System.out.println(acc.name + "\t");
			System.out.println(acc.balance + "\n");
		}
		
		
		
	}
}
