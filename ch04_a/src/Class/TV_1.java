package Class;
//이름규칙
//클래스명 : 대문자로 시작
//변수명, 메소드명 : all 소문자로 만든다
//sumRange	: 카멜 케이스		- JAVA
//sum_range	: 스네이크 케이스		- DB에서 쓰인다
public class TV_1 {
  
//		맴버변수(인스턴스변수), 속성, 객체변수...
//		타임(기본타입, 참조타입) 변수명;
		int channel;	//기본 타입(값)
		int[] name;		//참조 타입(주소) 배열이 추가 되었기 때문에
		String names;	//참조 타입(주소)
		
//		생성자
//		접근제한자 클래스명(){}
		public TV_1() {}	//메소드와 차이점 기본타입, return타입이 없다
		
//		메소드
//		리턴타입(기본타입, 참조타입, void) 메소드명(){} 를 가지고 있는 형태 
//		ex)main 메소드
//		void main(String[] args) {	//[특수한 메소드] void 리턴타입 main 메소드(인자){}
		int sum() {
			return 0;
		}
		void method1() {
			
		}
		
}
