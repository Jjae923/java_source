package ch8;

public class StringConstructor1 {
	public static void main(String[] args) {
		// 객체 생성
		String str1 = new String();
		
		byte bytes[] = {72,101,108,108,111,32,74,97,118,97};
		String str2 = new String(bytes);
		System.out.println(str2);	// Hello Java // 아스키코드값으로 글씨 출력한 것
		
		char ch[] = {'a', 'b', 'c', 'd', 'e'};
		String str3 = new String(ch);
		
		String str4 = new String("hello");		// 두번째로 많이 쓰는 형태 (★외우기)
		
		String str5 = new String(new StringBuffer("World"));
		String str6 = new String(new StringBuilder("World"));
		
		String str7 = "hello World";	// 가장 많이 쓰는 형태 (★외우기)
	}
}
