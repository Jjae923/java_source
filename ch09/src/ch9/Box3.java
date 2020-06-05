package ch9;

import java.util.ArrayList;

// 클래스명<T> : 객체 선언할 때는 타입을 정해서 선언해줘

public class Box3<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	@Override
	public String toString() {
		return list.toString();
	}
}
