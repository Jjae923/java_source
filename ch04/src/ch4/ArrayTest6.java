package ch4;

public class ArrayTest6 {
	public static void main(String[] args) {
		
		int arr1[]= {100,95,85,65,75,55}; // 제일 많이 쓰는 방식
		
		// 배열 요소의 합계와 평균을 출력
		
		int sum = 0;
		for(int i:arr1) {
			sum+=i;
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+sum/arr1.length);

		
		// 최대값을 출력
		
		int max = arr1[0];
		for(int i=1;i<arr1.length;i++) {
			if(arr1[i]>max) {
				max=arr1[i];
			}
		}
		System.out.println("최대값 : "+max);
		
		// 최소값을 출력
		
		int min = arr1[0];
		for(int i=1;i<arr1.length;i++) {
			if(arr1[i]<min) {
				min=arr1[i];
			}
		}
		System.out.println("최소값 : "+min);
	}

}
