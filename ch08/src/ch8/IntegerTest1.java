package ch8;

public class IntegerTest1 {
	public static void main(String[] args) {
		// int(기본타입) -> Integer(객체 타입)
		// int로 선언했던 것을 Integer로 선언가능, 객체타입은 메소드 사용 가능
		
		Integer ia = new Integer(10);
		Integer ib = new Integer(10);
		
		System.out.println(ia==ib); 		// false	주소 비교
		System.out.println(ia.equals(ib));  // true		값 비교
	}
}
