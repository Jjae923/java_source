package ch8;

public class LastIndexOf {
	public static void main(String[] args) {
		String str1 = "HelloHelloHello World";
		
		System.out.println(str1.indexOf('l'));		// 2   // indexOf = 앞에서부터 찾을 때 처음나오는 'l'이 몇번째 있어?
		System.out.println(str1.lastIndexOf('l'));	// 19  // lastIndexOf = 뒤에서부터 찾을 때 처음나오는 'l'이 몇번째 있어?

		// charAt3의 4줄과 같은 의미
//		for(int i=0;i<str1.length();i++) {
//			if(str1.charAt(i)=='프') {
//				System.out.println(i);
//			}
//		}
	}
}
