package stream;

import java.util.stream.Stream;

public class StreamFilter {
	public static void main(String[] args) {
		// 중간연산 - 2. filter : 조건에 맞는 요소 추출
		Stream<String> stream = Stream.of("바둑","바나나","포도","딸기","바질","강아지","고양이");
		
		// 바로 시작하는 문자 출력
		stream.filter(start -> start.startsWith("바")).forEach(System.out::println);
	}
}
