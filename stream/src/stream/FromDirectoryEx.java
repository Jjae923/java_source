package stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.nio.file.Paths;

public class FromDirectoryEx {
	public static void main(String[] args) {
		Path paths = Paths.get("d:\\upload\\2020\\07\\27");
		
		// Path 객체 stream 변환
		try(Stream<Path> stream = Files.list(paths)) {
			stream.forEach(files -> System.out.println(files.getFileName()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
