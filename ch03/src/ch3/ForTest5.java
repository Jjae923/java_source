package ch3;

public class ForTest5 {

	public static void main(String[] args) {
		// 1~100까지 숫자 중에서 3의 배수는 더하고 9의 배수는 안더해서 합계 출력하기
		// for와 if 사용
		
		// 내가 푼거 (if미사용)
		System.out.println();
		int sum1 = 0;
		for(int i=0; i<100; i+=3) {
			sum1+=i;
		}
		int sum2 = 0;
		for(int i=0; i<100; i+=9) {
			sum2+=i;
		}
		System.out.println("결과값 : " +(sum1-sum2));
		
		// 풀이
		System.out.println();
		int sum = 0;
		for(int i=1; i<101; i++) {
			if(i%3==0 && i%9!=0) {
				sum+=i;
			}
		}
		System.out.println("결과값 : "+sum);
		
		
		// 3의 배수 나열
		System.out.println();
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		
			
		//3의 배수이거나 5의 배수의 합 구하기
		System.out.println();
		sum = 0;
		for(int i=1; i<101; i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		System.out.println("결과값 : "+sum);
		
		// sum = 0;은 {} 안에 들어가면 그 때만 사용하고 사라지기 때문에 메인 sum과 중복 상관없음 
//		System.out.println();
//		for(int i=0;i<=10;i++){
//			sum = 0;
//		}
//		for(int i=1; i<101; i++) {
//			if(i%3==0 || i%5==0) {
//				sum+=i;
//			}
//		}
//		System.out.println("결과값 : "+sum);
		
		
	}

}
