package thread;

public class BigLetters {
	public static void main(String[] args) {
		// 멀티스레드로 같이 돌아갈 객체 생성하기
		Runnable r1 = new SmallLetters();
		Thread t1 = new Thread(r1);
		t1.start(); // 스레드 시작하기 // 시작은 언제일지 모름(제어불가능)
		
		
		// 대문자 A-Z까지 출력하기
//		for(char i=65;i<=90;i++) {
//			System.out.print(i);
//		}
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+"  ");
		}
	}
}
