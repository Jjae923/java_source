package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Java");
		list.add("JDBC");
		list.add("mysql");
		list.add(2,"mybatis");	// 특정 위치에 삽입 가능

		System.out.println(list);
		
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Java");
		set.add("JDBC");
		set.add("mysql");
//		set.add(2,"mybatis");\	// 특정 위치 지정 불가능
		
		System.out.println(set);

	}
}
