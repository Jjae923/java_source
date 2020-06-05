package ch8;

public class SubString {
	public static void main(String[] args) {

		String ssn = "880815-1234567";
		
		// 문자열 잘라내기
		String firstNum = ssn.substring(0, 6);	// 880815  // 중간을 잘라내고싶으면 시작값과 끝값을 지정
		System.out.println(firstNum);
		
		System.out.println(ssn.substring(7));	// 1234567 // 중간부터 끝까지 잘라내고싶으면 중간값만 지정
	}
}
