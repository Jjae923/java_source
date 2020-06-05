package ch8;

public class Case {
	public static void main(String[] args) {
		// 소문자 -> 대문자, 대문자 -> 소문자, 공백 제거
		String str1 = "abcdefg";
		String str2 = "ABCDEFG";
		String str3 = "   abc 대한민국   ";
		
		System.out.println(str1.toUpperCase());   // 대문자
		System.out.println(str2.toLowerCase());   // 소문자
		System.out.println(str3.trim());		  // 양쪽 공백 제거
		
		System.out.println(str3.equals("abc 대한민국"));  		// => 공백도 문자이기 때문에 false나옴!
		System.out.println(str3.trim().equals("abc 대한민국"));	// => 공백 제거하면 true나옴!
	}
}