package ch7;

public class ArrayIndexException3 {
	public static void main(String[] args) {
		// UnCheckedException
		// java.lang.ArrayIndexOutOfBoundsException   ---> 배열 사용 시 자주 발생
		try {
			System.out.println(args[0]);
			System.out.println(args[1]);
		} catch (Exception e) {
			System.out.println("사용법 : java 클래스명 인자1 인자2");
		}
	}
}
