package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FromArrayEx {
	public static void main(String[] args) {
		// 배열에서 스트림으로
		String[] strArr = {"사과","바나나","딸기","포도","멜론"};
		
		Stream<String> stream = Arrays.stream(strArr);
		stream.forEach(str -> System.out.println(str));
	}
}
