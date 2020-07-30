package stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentEx {
	public static void main(String[] args) {
		// 파일의 내용을 스트림으로 읽어서 출력하기
		Path path = Paths.get("src/stream/content.txt");
		try(Stream<String> stream = Files.lines(path)) {
			stream.forEach(System.out::println); // System.out::println → static메소드라서 가능
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
