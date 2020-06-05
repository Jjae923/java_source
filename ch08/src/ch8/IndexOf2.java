package ch8;

public class IndexOf2 {
	public static void main(String[] args) {
		
		String str1 = "Hello";
		
		System.out.println(str1.indexOf('o'));		// 4
		System.out.println(str1.indexOf('f'));		// -1
		System.out.println(str1.indexOf('f', 2));	// -1   // 2번째부터 찾아
		System.out.println(str1.indexOf("el", 2));	// -1	// 2번째부터 찾아
	}
}
