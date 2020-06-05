package test;

public class aaaaaaaaaaaaaa {
	public static void main(String[] args) {
		//초기화 범위
		
		//1
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				int sum = 0;
				sum++;
				System.out.print(sum);
//				111111111111111111.......
			}
		}
		
		System.out.println();
		
		//2
		for (int i = 0; i < 10; i++) {
			int sum = 0;
			for (int j = 0; j < 5; j++) {
				sum++;
				System.out.print(sum);
//				123451234512345........
			}
		}
		System.out.println();
		
		//3
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				sum++;
				System.out.print(sum);
//				1234567891011121314151617181920.......
			}
		}
		
		
	}
}
