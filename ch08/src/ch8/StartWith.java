package ch8;

public class StartWith {
	public static void main(String[] args) {
		String str1 = "java.lang.String";
		
		// startsWith = 시작하는 문자열 비교
		System.out.println(str1.startsWith("java"));   // true
		System.out.println(str1.startsWith("lang"));   // false
		
		// endsWith = 끝나는 문자열 비교
		System.out.println(str1.endsWith("String"));   // true
		
		String file = "test.txt"; // 확장자 확인 시 가장 유용한 메소드!
		System.out.println(file.endsWith("txt"));	   // true
	}
}
