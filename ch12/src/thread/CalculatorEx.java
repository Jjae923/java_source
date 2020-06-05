package thread;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator cal = new Calculator(); // 하나 만들고
		
		User1 user1 = new User1(cal);
		user1.start();
		
		User2 user2 = new User2(cal);
		user2.start();					// 두개 넣었으니까 공유한 상태!
	}
}
