package ch2;

public class ConditionalOpEx3 {

	public static void main(String[] args) {
		int score = 80;
		//  최우수, 우수, 보통
		String result=score > 90 ? "최우수" : score > 80 ? "우수" : "보통";
		System.out.println(result);
		// 조건이 2개일 땐 삼항연산자 많이 사용하고, 조건 3개일 땐 if 많이 사용

	}

}
