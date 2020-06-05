package ch3;

public class WhileTest1 {
	public static void main(String[] args) {
		// While : 반복
		// 모든 반복문은 초기화 / 조건검사/ 증감 이 필요!
		
		int i = 0; // 초기화
		
		while(i<11) { // 조건
			System.out.print(i+" "); // 반복문
			// 증감을 이용해서 조건을 만족할 때까지만 반복
			i++;
		}
		

	}

}
