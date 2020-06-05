package ch4;

public class ArrayTest1500000 {
	public static void main(String[] args) {
		
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,40,30},
				{40,50,20},
				{50,60,50},
		};
		int result[][]=new int[score.length+1][score[0].length+1];
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				result[i][j]=score[i][j];
						}
		}	
		
		
		// 풀다가 실패..!
		
//		int arr1[]= {100,95,85,65,75,55}; // 제일 많이 쓰는 방식
//		
//		// 배열 요소의 합계와 평균을 출력
//				
//		for(int i=0;i<score.length;i++) {
//			for(int j:result[i][score[0].length+1]) {
//				sum+=j;			
//			}
//		}
				
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
//				result
				System.out.printf("%5d",result[i][j]);
				}
			System.out.println();
		}
//		
//		int sum = 0;
//		for(int i:score[0]) {
//			sum+=i;
//		}
//		System.out.println(result[0][1]+sum);
//		
		
//		System.out.println(result[score.length+1]);
		
//		for(int i=) {
//			for(int j:arr) {
//				System.out.println(j);
//			}
//		}
		
		
		
		
	}

}
