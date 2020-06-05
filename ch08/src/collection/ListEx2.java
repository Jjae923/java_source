package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // List<E> : E -> 객체타입 담아줘
		
		// 요소 삽입
		list.add("김재환");	// index 0번부터 시작
		list.add("하성운");
		list.add("황민현");
		list.add("라이관린");
		list.add("박지훈");
		
		System.out.println(list); 					 	// toString 오버라이딩 되어 있음
		System.out.println(list.get(1));				// 1번 인덱스를 가지고 옴 (list구조의 특징:위치지정가능)
		System.out.println(list.size());				// list의 크기
		System.out.println(list.isEmpty());			 	// list가 비어있는 여부
		System.out.println(list.contains("하성운"));  	// 해당 문자 포함 여부
		System.out.println("특정 요소 : "+list.get(3));	// 해당 숫자 순서의 정보 가져오기
		System.out.println(list.remove(0));			 	// 해당 숫자의 정보 제거
		System.out.println(list); 					 	
		System.out.println(list.remove("박지훈")); 	 	// 정보 제거 
		System.out.println(list);
		
		list.sort(Comparator.naturalOrder());			// 오름차순 정렬
		System.out.println("정렬 후 : "+list);			
		list.sort(Comparator.reverseOrder());			// 내림차순 정렬
		System.out.println("정렬 후 : "+list);			
		
		// 리스트를 배열로 변경
		Object[] strArr=list.toArray();
		System.out.println(Arrays.toString(strArr));
		
		list.clear(); 								 // 리스트 객체 모두 삭제
		System.out.println(list);					 // [] → 아무것도 안나옴
		
		String fruit[] = {"사과", "딸기", "바나나", "수박", "참외", "자두"};
		
		// ★ 유용한 메소드
//		List<String> fruits = Arrays.asList(fruit); // 추가 시 java.lang.UnsupportedOperationException
		List<String> fruits = new ArrayList<String>(Arrays.asList(fruit)); // 배열을 ArrayList로 새로 담아서 공간늘리기
		fruits.add("메론");
		System.out.println(fruits);
	}
}
