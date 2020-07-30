package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("사과","바나나","딸기","포도","메론");
		String[] strArr = {"비행기","자동차","배","자전거","오토바이","버스"};
		
		// 정렬한 후 출력
		Arrays.sort(strArr);
		for(String str : strArr) {
			System.out.println(str);
		}
		
		Collections.sort(strList);
		for(String str : strList) {
			System.out.println(str);
		}
		
		System.out.println();
		Stream<String> streamArr = Arrays.stream(strArr);
		Stream<String> streamList = strList.stream();
		
		// 스트림 정렬하고 출력하기
		streamArr.sorted().forEach(System.out::println);
		System.out.println();
		streamList.sorted().forEach(System.out::println);
	}
}
