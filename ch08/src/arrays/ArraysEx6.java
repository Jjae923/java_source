package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx6 {
	public static void main(String[] args) {
		Integer arr[] = {37,21,56,99,88,58,62,15,39,78};
		
		// 정렬 전
		System.out.println(Arrays.toString(arr));
		
		// 내림차순 정렬
		// sort(T[] a, Comparator<? super T> c)     // ★ T[] : 객체타입의 배열을 선언하면 쓸 수 있게 해줄게 ★
		Arrays.sort(arr,Comparator.reverseOrder()); // reverseOrder() : 인터페이스에 있는 추상메소드
		
		// 정렬 후
		System.out.println(Arrays.toString(arr));
	}
}
