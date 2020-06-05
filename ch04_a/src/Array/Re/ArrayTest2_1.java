package Array.Re;

public class ArrayTest2_1 {
	public static void main(String[] args) {
//		char 타입을 담은 배열
//		빈 문자열로 초기화(방마다 값을 입력하지 않았음)
		char arr1[] = new char[3];
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
//		double 타입을 담은 배열
//		double의 기본값 0.0으로 생성(초기화), 정수 계열은 0으로 나온다
		double arr2[] = new double[3];
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
//		boolean 타입을 담은 배열
//		boolean의 기본값은 false로 생성(초기화)
		boolean arr5[] = new boolean[3];
		System.out.println(arr5[0]);
		System.out.println(arr5[1]);
		System.out.println(arr5[2]);
		
//		String 타입을 담은 배열
//		String의 기본값은 null로 생성(초기화), Reperence type은 null이 나온다
		String arr4[] = new String[3];
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		
	}
}
