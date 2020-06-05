package Array;

public class ArrayTest11 {
	public static void main(String[] args) {
		
		String str[] = new String[3];
		
		str[0] = "Hello";
		str[1] = "Hello";
		str[2] = new String("Hello");	//String 객채 변수를 메모리를 새로 할당한다
		
		System.out.println(str[0] == str[1]);	//true
		System.out.println(str[1] == str[2]);	//false
		System.out.println(str[1].equals(str[2]));	//문자열 비교는 .equals 사용
		
	}
}
