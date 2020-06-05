package Quesion;

public class Container<T> {
	private T item;
	
	void set(T item) {
		this.item=item;
	}
	T get() {
		return item;
	}
}
