package arrays;

import java.util.Arrays;

public class ArraysSearch {
	public static void main(String[] args) {
		// 정렬된 상태가 아닌 경우 => 선형검색 (효율이 떨어짐)
		int arr[] = {10,99,18,55,45,35,65};
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 45)); // binarySearch(이진검색) => 정렬되지 않으면 의미가 없음
		
		// 배열에 45라는 값이 들어 있는지 확인하고
		// 찾으면 그 찾은 위치를 출력하고
		// 찾지 못하면 검색 값 없음 이라는 메세지를 출력 
		int i = 0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==45) {
				System.out.println("찾은 위치 : "+(i+1)+"번째");
				break;
			} 
		}
		if(i == arr.length) {
			System.out.println("검색 값 없음");
		}
	}
}
