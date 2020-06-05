package ch9;

// Number를 상속받는 애들 : Byte, Double, Float, Integer, Long 등
public class BoundedTypeEx {
	public static void main(String[] args) {
		int result = BoundedType.compare(new Double(3.14), new Double(4.15));
		// compare : 뒤의 숫자가 더 크면 -1 / 앞의 숫자가 크면 1 / 같으면 0 을 가져옴
		System.out.println(result);
		
//		BoundedType.compare("a","b"); // 제한된 Generic 메소드이기 때문에 에러남!

	}
}
