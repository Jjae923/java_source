package collection;

import java.util.Arrays;

public class FindKim {
	public static void main(String[] args) {
		String names[] = {"Queen", "Tod", "Kim", "Park", "Choi"};
				
		// 넘겨받은 배열에서 Kim이라는 문자열의 위치를 찾아
		// Kim은 3번째 위치에 있다 라는 문자열을 리턴하는
		// 메소드 작성하기
		
		Arrays.sort(names);
		System.out.println(Arrays.binarySearch(names, "Kim"));
		
		int pos = 0;
		pos = Arrays.asList(names).indexOf("Kim");
		System.out.println("Kim은 "+(pos+1)+"번째 위치에 있다");
	}
}
