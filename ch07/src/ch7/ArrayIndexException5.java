package ch7;

public class ArrayIndexException5 {
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
		
		// jdk7부터 추가된 multi catch문	
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("인자 값을 확인해주세요.");
			System.out.println("사용법 : java 클래스명 인자1 인자2");
		} 
		
	}
}
