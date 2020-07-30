package stream;

import java.util.stream.Stream;

public class StreamDistinct {
	public static void main(String[] args) {
		// 중간연산 - 3. distinct : 중복 제거
		Stream<String> stream = Stream.of("사과","바나나","딸기","포도","메론","배","사과","복숭아");
		
		// 요소들의 중복을 제거하고 출력하기
		stream.distinct().forEach(System.out::println);
	}
}
