package Array;

import java.util.Scanner;

public class ArrayTest14 {
	public static void main(String[] args) {
		int oldScore[][] = { {12,13},{14,15} };
		
		int newScore[][] = new int[oldScore.length][oldScore[0].length];
//								  [    {12,13}    ][     {14,15}      ]
		
		for (int i = 0; i < oldScore.length; i++) {
			for (int j = 0; j < oldScore[i].length; j++) {
//								oldScore[i].length - 행이 가지고 있는 열의 길이
				newScore[i][j] = oldScore[i][j];
				
			}
		}
		
		//newScore 출력
		for (int[] arr : newScore) {
			for (int j : arr) {
				System.out.print(j + " ");
			}
		System.out.println();
		}
		
//		===================================================
		System.out.println();
		
		//일단 for문으로
		for (int i = 0; i < newScore.length; i++) {
			for (int j = 0; j < newScore[i].length; j++) {
				System.out.print(newScore[i][j] + " ");
			}
			System.out.println();
		}
	}
}
