package arrays;

import java.util.Arrays;

public class ArraysEx5 {
	public static void main(String[] args) {
		String arr[] = {"강아지", "동물", "광고", "피아노", "다람쥐", "테스트", "노랑"};
		
		// 정렬 전
		System.out.println(Arrays.toString(arr));
		
		// 오름차순 정렬
		Arrays.sort(arr);
		
		// 정렬 후
		System.out.println(Arrays.toString(arr));
	}
}
