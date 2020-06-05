package ch9;

public class BoxEx2 {
	public static void main(String[] args) {
		// Generic - 타입안정성 / 타입체크와 형변환 생략이 가능하므로 코드 간결

		Box2<String> box = new Box2<String>();	// 나 String 담을거야 선언
		// 파란색 Box2 : 원시타입 / Box2<String> : Generic Class
		
		box.setItem("홍길동");
		System.out.println(box.getItem());
	}
}
