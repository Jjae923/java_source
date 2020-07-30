package stream;

import java.util.stream.Stream;

public class StreamPeek {
	public static void main(String[] args) {
		// 중간연산 - 4. peek : 중간 연산 확인하기
		Stream<String> stream = Stream.of("abc","def","melon","apple","text","grape");
		
		stream.map(String::toUpperCase)
			  .peek(s -> System.out.printf("map 확인 : %s\n",s)) // 중간에 연산 결과 확인하는 용도
			  .forEach(System.out::println);
	}
}
