package Array;

public class ArrayTest2 {
	public static void main(String[] args) {
//		char 타입을 담는 배열 생성
//		타입 배열명[] = new 타입[숫자]
		
		//빈 문자열로 초기화
		char arr1[] = new char[3];	//char를 3개 담는다
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		//향상된 for문
		for (char c : arr1) {
			System.out.println(c);
		}

		//double 타입을 담는 배열 생성
		double arr2[] = new double[3];	//0.0 기본값 (정수 계열 0으로 나온다)
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

		//향상된 for문
		for (double d : arr2) {
			System.out.println(d);
		}
		
		//boolean 타입 배열 생성
		boolean arr3[] = new boolean[3];	//false로 초기화된다
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		//향상된 for문
		for (boolean b : arr3) {
			System.out.println(b);
		}
		
		//String 배열 생성
		String arr4[] = new String[3];	//null (reperence type은 null이 나온다)
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		
		//향상된 for문
		for (String str : arr4) {
			System.out.println(str);
		}
		
	}
}
