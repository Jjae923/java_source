package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx7 {
	public static void main(String[] args) {
		// ascii => A(65), a(97)
		Character arr[] = {'a', 'z', 'C', 'k', 'A', 't', 'b', 'l', 'B', 'm'};
		
		// 정렬 전
		System.out.println(Arrays.toString(arr)); // int 배열을 String형태로 출력 => 요소만 확인할 때
		
		// 내림차순 정렬  // sort앞에 들어오는 건 반드시 객체타입이어야함!
		Arrays.sort(arr,Comparator.reverseOrder());
		
		// 정렬 후
		System.out.println(Arrays.toString(arr));
	}
}
