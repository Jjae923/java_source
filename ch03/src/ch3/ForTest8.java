package ch3;

public class ForTest8 {
	public static void main(String[] args) {
		// 이중for문
		// 행/열 구조를 가진 결과를 원할 때 사용
		// 행=>바깥for문(!!println임!!)
		// 열=>안쪽for문(!!print임!!)
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
