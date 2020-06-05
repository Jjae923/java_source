package classtest;

public class BankEx {
	public static void main(String[] args) {
		
		GoodBank good = new GoodBank();
		printRest(good);
		NormalBank normal = new NormalBank();
		printRest(normal);
		BadBank bad = new BadBank();
		printRest(bad);
	}

	// 이자율을 출력하는 메소드
	public static void printRest(Bank bank) {  		// 오버라이딩이 되어있는 경우 메소드를 다형성으로 받아서 이렇게 출력할 수 있음
		System.out.println(bank.getinterestRate());
	}
	
//  오버로딩 ---> 부모메소드가 없는 경우에는 오버로딩을 하지만 부모메소드가 있는 경우엔 못짠 코딩!!
//	public static void printRest(GoodBank good) {
//		System.out.println(good.getinterestRate());
//	}
//	public static void printRest(NormalBank normal) {
//		System.out.println(normal.getinterestRate());
//	}
//	public static void printRest(BadBank bad) {
//		System.out.println(bad.getinterestRate());
//	}
}