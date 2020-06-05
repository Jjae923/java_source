package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx3 {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>(100000);
		LinkedList<String> linkedList = new LinkedList<String>();
		add(arrayList);
		add(linkedList);
		System.out.println("=== 접근 시간 테스트 ===");				// ArrayList > LinkedList
		System.out.println("ArrayList : "+access(arrayList));		// 연속된 공간에 있기 때문에 주소 계산이 쉬워 시간이 적게 들고 그만큼 빨리 찾을 수 있음
		System.out.println("LinkedList : "+access(linkedList));
	}
	public static void add(List<String> list) {
		for(int i=0;i<100000;i++) {
			list.add(i+"");
		}
	}
	public static long access(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			list.get(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
}
