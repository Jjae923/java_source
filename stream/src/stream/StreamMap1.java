package stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamMap1 {
	public static void main(String[] args) {
		// 스트림 중간 연산 - map() : 스트림에 저장된 값 중에서 원하는 필드만 뽑아내거나 스트림의 요소를 반환한다.
		// mapToDouble(), mapIoInt(), flatMap()....
		
		// 파일 객체를 스트림으로 변환
		Stream<File> fileStream = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("file3.txt"));
		
		// 파일 이름을 가져와서 Stream<String> 형태로 리턴
		Stream<String> names = fileStream.map(File::getName);
		// 파일의 이름 출력하기
		names.forEach(name -> System.out.println(name));
	}
}
