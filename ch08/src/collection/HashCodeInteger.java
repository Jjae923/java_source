package collection;

public class HashCodeInteger {
	public static void main(String[] args) {
		Integer int1 = new Integer(15);
		Integer int2 = 25;
		Integer int3 = 15;
		
		// HashCode : 객체를 식별할 수 있는 하나의 정수값
		System.out.println("int1.hashCode : "+int1.hashCode());
		System.out.println("int2.hashCode : "+int2.hashCode());
		System.out.println("int3.hashCode : "+int3.hashCode());
	}
}
