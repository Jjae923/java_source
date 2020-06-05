package ch8;

public class CharAt {
	public static void main(String[] args) {

		String str1 = "Hello! Java";
		System.out.println(str1.charAt(5));   // 문자열에도 index가 있다! (※0부터 시작)
		System.out.println(str1.length());
		
		// 7번째 문자가 K인지 확인
		if(str1.charAt(7)=='K') {			// 문자는 '' 안에 넣고 비교 
		}
	}
}
