package Array;

import java.util.Scanner;

public class ArrayTest15 {
	public static void main(String[] args) {
		
		int[][] score =  {
				{100,100,100},
				{20,20,20},
				{30,40,30},
				{40,50,20},
				{50,60,50}
		};
		int result[][] = new int[score.length + 1][score[0].length+1];
//								[합계 기록칸을 추가 ]
		//Score
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//				result[i][j] = score[i][j];
////				score에 담겨 있는 값을 result에 담아라
//				result[i][3] += score[i][j];	//가로 행합계
//				result[5][j] += score[i][j];	//세로 열합계
//				result[5][3] += score[i][j];	//전체   합계
//			}
//		}
		
		
		
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
//								oldScore[i].length - 행이 가지고 있는 열의 길이
				result[i][j] = score[i][j];
				
			}
		}
		
		//출력
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}
		
				
	}
}

//100  100  100  300
//20   20   20   60
//30   40   30   100
//130  160  90   110
//50   60   50   160
// 0    0    0    0
