package ch8;

public class TocharArray {

	public static void main(String[] args) {

		String str1 = "Hello! Java";
		
		char[] arr = str1.toCharArray();    // CharAt2에서 4줄과 같은 의미
//		char arr[] = new char[str1.length()];
//		for(int i=0;i<arr.length/*=str1.length()*/;i++) {
//			arr[i] = str1.charAt(i);
//		}
		
		for(char ch:arr) {
			System.out.print(ch);
		}
	}
}
