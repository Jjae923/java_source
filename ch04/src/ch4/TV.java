package ch4;
//이름규칙
//클래스명 : 대문자로 시작
//변수명/메소드명 : 소문자로 전부 만든다
// sumRange (카멜case)--->주로 java에서
// sum_range (스네이크case)--->주로 DB에서

public class TV {
	//public class : 아무나 이용가능하게 만드는 클래스(공공개방)
	
	//멤버변수(인스턴스변수), 속성, 객체변수...
	//타입(기본타입,참조타입), 변수명;
	int channel;
	String names;
	
	//생성자
	//접근제한자(=public) 클래스명(){}
	public TV() {} // 생성자는 리턴타입이 없음, 이름은 클래스명과 동일해야함
	
	
	
	//메소드
	//리턴타입(기본타입,참조타입,void) 메소드명(){}
	int sum() {
		return 0;
	}
	void method1() { // void는 던지는 값 없음
		
	}
	
}
