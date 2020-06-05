package ch2;

public class NumMultiple {

	public static void main(String[] args) {
		// 변수 num의 값보다 크면서도 가장 가까운 10의 배소에서 변수 num의 값을 뺀 나머지를 구하시오.
		// 예를 들어 24의 크면서도 가장 가까운 10의 배수는 30이고 19의 경우는 20이고, 81의 경우는 90이다.
		int num = 24; // 30-24=6
		
		//내가 푼거
		int result = (num / 10 + 1)*10 - num;
		System.out.printf("답 : %d\n", result);
		
		
		//풀이
		System.out.println(10-(num%10));

	}

}
