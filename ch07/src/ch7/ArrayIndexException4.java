package ch7;

public class ArrayIndexException4 {
	public static void main(String[] args) {
		// UnCheckedException
		// java.lang.ArrayIndexOutOfBoundsException   ---> 배열 사용 시 자주 발생
		try {
			// java.lang.ArrayIndexOutOfBoundsException
			String data1 = args[0];
			String data2 = args[1];
			
			// java.lang.NumberFormatException ===> Integer.parseInt 사용 시 거의 발생
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
		
		// 다중 catch문
		} catch (NumberFormatException e) {
			System.out.println("인자 값을 확인해주세요.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("사용법 : java 클래스명 인자1 인자2");
		}
		
//		catch 구문 순서 상관없는데 부모자식 순서가 바뀌면 안됨 (뒤에는 부모인 Exception으로 와도되는데 앞에오면 안됨)
		
	}
}
