package ch9;

public class BoundedType {
	public static <T extends Number> int compare(T t1, T t2) { // Number와 Number를 상속받는 애들만 T에 들어올 수 있다
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
	}
}
