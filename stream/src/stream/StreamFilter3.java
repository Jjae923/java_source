package stream;

import java.util.stream.Stream;

public class StreamFilter3 {
	public static void main(String[] args) {
		Stream<Student> stream = Stream.of(new Student("홍길동",98,65),
										   new Student("김지원",89,75),
										   new Student("박서준",67,85));
		// 성이 "박"인 학생 출력하기
//		stream.filter(stu -> stu.getName().startsWith("박")).forEach(System.out::println);
		//성이 "박"인 학생의 이름만 출력하기
		stream.map(stu -> stu.getName()).filter(start -> start.startsWith("박")).forEach(System.out::println);
	}
}
