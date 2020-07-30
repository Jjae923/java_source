package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
	public static void main(String[] args) {
		// 최종연산 - 1. forEach
		//			  2. collect : 스트림 요소를 그룹화하거나 결과를 컬렉션에 담아 변환하는데 사용
		
		// Student 의 수학점수를 모아서 리스트로 출력
		Stream<Student> stream = Stream.of(new Student("문강태",85,75),
										   new Student("고문영",95,80),
										   new Student("문상태",90,95),
										   new Student("김수현",82,90));
		
		List<Integer> maths = stream.map(Student::getMath)  // 수학점수 모으기
			  .collect(Collectors.toList()); 				// 모은 수학점수(스트림)를 리스트로 반환
		
		System.out.println(maths);
	}
}
