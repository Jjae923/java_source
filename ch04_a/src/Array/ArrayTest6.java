package Array;

public class ArrayTest6 {
	public static void main(String[] args) {
		int arr1[] = {100,95,85,65,75,55};
		
		//배열 요소의 합계와 평균을 출력
		
		int sum = 0;
		for (int i : arr1) {
			sum+=i;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum / arr1.length));
		
		//배열 요소에서 가장 큰 값 출력
		int max = arr1[0];	//max에 0번방에 있는 값을 담는다
		for (int i = 1; i < arr1.length; i++) {	//0번은 담았기 때문에 1부터 담는다
			if (arr1[i] > max) {				//i번 중의 방에서 max 보다 큰것은
				max = arr1[i];					//max는 i방에 있는 값고 같다
			}
		}System.out.println(max);
		
		//배열 요소에서 가장 작은 값 출력
//		int min = arr1[0];
//		for (int i = 1; i < arr1.length; i++) {
//			if (arr1[i] < min) {
//				min = arr1[i];
//			}
//		}System.out.println(min);
		
		//풀이
		int min = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}
			if (arr1[i] < min) {
				min = arr1[i];
			}
		}System.out.println("최대갑 : " + max + " 최소값 : " + min);
		
		
	}
}
