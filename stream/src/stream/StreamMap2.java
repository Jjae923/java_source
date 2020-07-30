package stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamMap2 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("abc","def","apple","melon","text","banana");
		
		// stream 값을 대문자로 변경 후 출력
//		stream.map(String::toUpperCase).forEach(c -> System.out.println(c));
		stream.map(String::toUpperCase).forEach(System.out::println);
	}
}
