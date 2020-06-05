package arrays;

import java.util.Arrays;

public class ArraysEx2 {
	public static void main(String[] args) {
		int arr[] = {37,21,56,99,88,58,62,15,39,78};
		
		// 정렬 전
//		System.out.println(arr); // int 배열은 바로 출력이 되지않아서 for문을 사용함
		System.out.println(Arrays.toString(arr)); // int 배열을 String형태로 출력 => 요소만 확인할 때
		
		// 오름차순 정렬
		Arrays.sort(arr);
		
		// 정렬 후
		System.out.println(Arrays.toString(arr));
	}
}
