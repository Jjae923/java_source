package ch3;

public class ForTest13 {
	public static void main(String[] args) {
		// 2와 100 사이에 있는 모든 소수를 찾는 프로그램 작성
		// 소수 : 1과 자기자신으로만 나누어 떨어지는 1보다 큰 양의 정수
		// 2~100까지의 소수
		// 2 3 5 7 11 13 17 19 23 29 31 37........

		
		// 내가 푼 거
		// 소수로 나뉘어지는 것 제외
		// 나머지가 0인거 제외

//		for(int i=1;i<=100;i++) {
//			for(int j=1;j<=100;j++) {
//				if(i%j!=0) {
//					System.out.printf("%d, ",i);
//				}
//			}
//		}
		
		
		// 풀이
		int count = 0;
		for(int i=2;i<=100;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2)
				System.out.print(i+" ");
			count=0;
		}

	}

}