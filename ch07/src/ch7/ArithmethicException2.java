package ch7;

public class ArithmethicException2 {
	public static void main(String[] args) {

		try {
			int num1 = 3, num2 = 0;
			System.out.println(num1 / num2);
		} catch (Exception e) {
			e.printStackTrace();   // ---> 어디서 에러가 나는지 확인하는 명령어
			System.out.println("0으로 나눌 수 없습니다.");
		}
	
	}
}
