package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx8 {
	public static void main(String[] args) {
		String arr[] = {"apple", "good", "height", "piano", "any", "arm", "ape"};
		
		// 정렬 전
		System.out.println(Arrays.toString(arr));
		
		// 오름차순 정렬
		Arrays.sort(arr,Comparator.reverseOrder());
		
		// 정렬 후
		System.out.println(Arrays.toString(arr));
	}
}
