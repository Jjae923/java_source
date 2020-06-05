package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		// List 계열은 배열과 같음
		// 객체 생성 시 크기 지정이 필수 요소가 아님
		// 배열과 같은 개념으로, 크기 미지정 시 더 넓은 공간을 잡고 복사하기 때문에 처음에 넉넉한 공간을 지정하는게 낫다
		// 순서를 가지고 있음
		// 데이터의 중복을 허용
		
		List<String> list = new ArrayList<String>(); // List<E> : E -> 객체타입 담아줘
		
		// 요소 삽입
		list.add("사과");
		list.add("딸기");
		list.add("수박");
		list.add("키위");
		list.add("파인애플");
		list.add("포도");
		list.add("감");
		list.add("복숭아");
		
		// 요소 확인
		for(String str : list) {
			System.out.println(str);
		}
	}
}
