package collection;

public class HashCodeString {
	public static void main(String[] args) {
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		String str3 = new String("안녕하세요");
		String str4 = "안녕하세요";
		
		// HashCode : 객체를 식별할 수 있는 하나의 정수값
		System.out.println("str1.hashCode : "+str1.hashCode());
		System.out.println("str2.hashCode : "+str2.hashCode());
		System.out.println("str3.hashCode : "+str3.hashCode());
		System.out.println("str4.hashCode : "+str4.hashCode());
		// 같은 문자열은 같은 정수값을 돌려줌 => str1, str3, str4는 같은 객체
	}
}
