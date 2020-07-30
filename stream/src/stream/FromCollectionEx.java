package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionEx {
	public static void main(String[] args) {
		// List -> stream
		List<String> list = Arrays.asList("사과","바나나","딸기","포도","메론");
		Stream<String> stream = list.stream();
		
		stream.forEach(fruit -> System.out.println(fruit));
	} 
}