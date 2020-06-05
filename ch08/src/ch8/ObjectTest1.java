package ch8;

public class ObjectTest1 {

	public static void main(String[] args) {
		
		Object obj1 = new Object();  // Object는 디폴트생성자만 갖고있기 때문에 객체 생성 시 매개변수 넣으면 안됨
		Object obj2 = new Object();  
		
		// == (기본타입), equals() => String
		
		// Object를 비교할 때 쓰는 ==, equals()는 같은 개념 => 둘 다 주소비교!
		System.out.println(obj1==obj2);				// false
		System.out.println(obj1.equals(obj2));  	// false
												
		// heap에 각각 새로운 공간을 잡은 거라서 stack의 주소다름!
		// ※ equals는 기본 주소비교 ※ 오버라이딩해서 다른 의미로 사용하는 것!
		
		// toString() : 객체 문자 정보 (클래스명@16진수)
		System.out.println(obj1.toString());	// java.lang.Object@15db9742
		System.out.println(obj2.toString());	// java.lang.Object@6d06d69c
	}
}
