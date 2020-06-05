package Array;

public class ArrayTest9 {
	public static void main(String[] args) {
		
		int arr1[][] =  {
				{15,25,35},
				{45,55}
		};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.println(arr1[i][j]);
			}
		}
		
		//향상된 for문
		for (int[] i : arr1) {		//1차원(첫째줄) 배열 가져옴
			for (int j : i) {		
				System.out.println(j + " ");
			}
		}
		
		
		
	}
}
