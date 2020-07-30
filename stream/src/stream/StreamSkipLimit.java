package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSkipLimit {
	public static void main(String[] args) {
		// 중간연산 - 5. skip : 스트림의 요소 일부 건너뛰기
		//			  6. limit : 스트림의 요소 제한하기
		Stream<String> stream = Stream.of("사과","바나나","딸기","포도","메론","배","사과","복숭아");
		
		// 스트림의 요소 중 2개를 건너뛰고, 출력을 3개만 하기
		stream.skip(2)
			  .limit(3)
			  .forEach(System.out::println);
			  
		// 1~10 사이의 숫자를 스트림으로 만들고 5,6,7,8만 출력
		IntStream streami = IntStream.rangeClosed(1, 10);
		
		streami.skip(4)
			   .limit(4)
			   .forEach(System.out::println);
	}
}
