package Array;

public class ArrayTest1 {
	public static void main(String[] args) {
//		타입(기본, 참조) 배열명[];	//배열 선언
		
//		int num1;	//초기화는 값을 넣어줘야 한다
//		System.out.println(num1);
		
		int arr1[];	//배열 선언
		
		//배열 생성
		arr1 = new int[5];	//int형 5개를 하나의 이름으로 담는다
		//arr1 = new int[5]; 없으면 오류 :initialized 초기화가 되지 않았다는 말
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		System.out.println();
		
		//향상된 for문
		for (int i : arr1) {
			System.out.println(i);
		}
		
	}
}
