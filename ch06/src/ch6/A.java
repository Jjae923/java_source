package ch6;

public interface A {
//	String str; // 인터페이스 안에서는 변수선언X 기본 파이널
	String str=""; // 상수 필드만 선언 가능
	
	void print(); // 추상메소드만 가능
	              // java8버전부터 static or default 키워드가 붙은 메소드까지 가능
	
	default void test() {}
	static void sum() {}

}