package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionEx2 {
	public static void main(String[] args) {
		// List -> stream
		List<Student> list = Arrays.asList(
				new Student("홍길동",98,65),
				new Student("김지원",89,75),
				new Student("박서준",67,85));
		Stream<Student> stream = list.stream();
		
		stream.forEach(student -> System.out.println(student.getName()));
	}
}
