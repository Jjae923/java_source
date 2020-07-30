package stream;

import java.util.stream.IntStream;

public class FromIntEx {
	static int sum = 0;
	public static void main(String[] args) {
		// 정수 범위를 스트림으로 변환
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(i -> sum += i);
		System.out.println("1 ~ 100의 합 : "+sum);
	}
}
