package ch8;

public class CharAt2 {
	public static void main(String[] args) {
		String str1 = "Hello! Java";
		
		// String으로 선언된 값을 char 배열에 담고 배열 출력하기   // toCharArray로 대체 가능
		char arr[] = new char[str1.length()];
		for(int i=0;i<arr.length/*=str1.length()*/;i++) {
			arr[i] = str1.charAt(i);
		}
		for(char ch:arr) {
			System.out.print(ch);
		}
	}
}
