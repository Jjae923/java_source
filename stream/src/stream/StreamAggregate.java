package stream;

import java.util.stream.IntStream;

public class StreamAggregate {
	public static void main(String[] args) {
		// 최종연산 - count(), sum(), average(), max(), min(), findFirst()
		
		IntStream stream = IntStream.rangeClosed(1, 10);
		
		// 2의 배수 개수 출력
//		System.out.println("2의 배수 개수 : "+stream.filter(i -> i%2 == 0).count());   // 2의 배수 개수 : 5
		
		// 2의 배수 합
//		System.out.println("2의 배수 합 : "+stream.filter(i -> i%2 == 0).sum());   // 2의 배수 합 : 30
		
		// 2의 배수 평균
//		System.out.println("2의 배수 평균 : "+stream.filter(i -> i%2 == 0).average());   // 2의 배수 평균 : OptionalDouble[6.0]
		
		// 2의 배수의 최대값
//		System.out.println("2의 배수의 최대값 : "+stream.filter(i -> i%2 == 0).max());   // 2의 배수의 최대값 : OptionalInt[10]
		
		// 2의 배수의 최소값
//		System.out.println("2의 배수의 최소값 : "+stream.filter(i -> i%2 == 0).min());   // 2의 배수의 최소값 : OptionalInt[2]
		
		// 2의 배수 중 첫번째값
		System.out.println("2의 배수 중 첫번째값 : "+stream.filter(i -> i%2 == 0).findFirst());   // 2의 배수 중 첫번째값 : OptionalInt[2]
	
	}
}
