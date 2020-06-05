package ch8;

public class Replace {
	public static void main(String[] args) {

		// String : immutable(변경할 수 없는)
		// String 자체는 변경할 수 없음, 그래서 String을 변경하는 메소드 별로 없음
		// 때문에 변경할 때는 StringBuffer와 StringBuilder 사용, 둘은 변경하는 메소드 있음
		
		String str = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		
		str.replace("자바", "Java");				// replace(기존,변경) = 기존문자를 변경문자로 바꿔줘
		System.out.println(str);				// 자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.
		
		str = str.replace("자바", "Java");
		System.out.println(str);				// Java는 객체지향 언어입니다. Java는 풍부한 API를 제공합니다.
		
		str=str.replaceFirst("Java", "자바");	// replaceFirst(기존,변경) = 처음만 바꿔줘 
		System.out.println(str);				// 자바는 객체지향 언어입니다. Java는 풍부한 API를 제공합니다.
	}
}
