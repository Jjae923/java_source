package stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamTest2 {
	public static void main(String[] args) {
		Stream<File> stream = Stream.of(new File("file1.txt"), new File("file2.txt"),
				new File("Ex1"), new File("Ex2.bak"), new File("test.java"));
		
		// 파일의 확장자 출력하기 (원하는 결과값 : txt, bak, java)
		// 확장자가 없는 파일은 제외 / 확장자 중복 제거
		
		// 파일의 이름 모으기
		stream.map(File::getName)
				.filter(f -> f.indexOf(".") > -1)  // 확장자가 있는 것만 추출
				.map(f -> f.substring(f.lastIndexOf(".")+1))  // 확장자만 모으기
				.distinct()
				.forEach(System.out::println);
	}
}
