package ch4;

public class ArrayTest1 {
	public static void main(String[] args) {
		
		int num1=322;
		System.out.println(num1); // 기본타입에서 변수는 값을 지정해줘야하지만 참조타입은 기본값을 제공 
		
		
		// 타입(기본,참조) 배열명[]; // 배열 선언
		int arr1[];
		// 배열 생성
		arr1 = new int[5]; // 똑같은 타입을 담기위해 변수 선언=>배열 생성
//		System.out.println(arr1[0]); // 무조건 0부터 시작
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
//		System.out.println(arr1[4]);
//		System.out.println(arr1[5]);
//		배열에서 제일 많이 나오는 오류
//		ArrayIndexOutOfBoundsException: 5 => 범위를 벗어남
		
		// 향상된 for문
		// for (변수 유형 새로운 변수지정 : 배열명) {
		//     실행문(변수포함);
		// }
		for(int i : arr1) {
			System.out.println(i);
		}
		
		
	}

}
