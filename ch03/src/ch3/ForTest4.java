package ch3;

public class ForTest4 {
	public static void main(String[] args) {
		// 1~100까지 짝수의 합
		
		System.out.println();
		int sum = 0;
		for(int i=0; i<100; i+=2) {
			sum+=i;
		}
		System.out.println("1~100까지 짝수의 합 : " +sum);
		
		// 3의 배수 나열
		System.out.println();
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
	}
}
