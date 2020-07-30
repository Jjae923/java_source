package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFilter2 {
	public static void main(String[] args) {
		// 1~10 사이의 숫자를 스트림으로 생성
		IntStream stream = IntStream.rangeClosed(1,	10);

		// 생성된 스트림에서 짝수만 출력
		stream.filter(i -> i%2 == 0).forEach(System.out::println);
		
		System.out.println();
		// 생성된 스트림에서 2로 나눈 나머지가 0이 아니고
		// 3으로 나눈 나머지가 0이 아닌 요소를 출력
		
		// stream has already been operated upon or closed
		// stream은 한번 소비되고 나면 닫힘 => 또 다른 연산을 하려면 새로운
		// stream을 열어야 함
		IntStream stream2 = IntStream.rangeClosed(1, 10);
		stream2.filter(i -> i%2 != 0 && i%3 != 0).forEach(System.out::println);
	}
}
