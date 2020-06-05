package arrays;

import java.util.Arrays;

public class ArraysEx3 {
	public static void main(String[] args) {
		// ascii => A(65), a(97)
		char arr[] = {'a', 'z', 'C', 'k', 'A', 't', 'b', 'l', 'B', 'm'};
		
		// 정렬 전
		System.out.println(Arrays.toString(arr));
		
		// 오름차순 정렬
		Arrays.sort(arr);
		
		// 정렬 후
		System.out.println(Arrays.toString(arr));
	}
}
