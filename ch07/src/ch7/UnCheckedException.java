package ch7;

public class UnCheckedException {
	public static void main(String[] args) {

		// 런타임에 발생하는 Exception
		String data = null;
		System.out.println(data.toLowerCase());  // --> 실행해야 알 수 있다는 예외가 있음
												 // 해결하는 방법에 따라 개발자의 역량이 가장 뚜렷한 부분!
	}
}
