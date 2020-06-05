package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		// 요소 추가
		map.put("id_0123", "하성운");
		map.put("id_0124", "박보검");
		map.put("id_0125", "송중기");
		map.put("id_0126", "현빈");
	
		// @@첫번째 방법
		// 모든 key값 담기
		Set<String> key = map.keySet();
		// 담은 key값을 Iterator 구조로 변경
		Iterator<String> iter = key.iterator();
		// hasNext() : 가지고 나올게 있으면 가지고옴
		while(iter.hasNext()) {
			String id = iter.next();
			String value = map.get(id);
			System.out.println(id+" : "+value);
		} 											// map에 들어있는 걸 가지고 나오는 또 다른 방법
		System.out.println();
		
		// @@두번째 방법
		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
