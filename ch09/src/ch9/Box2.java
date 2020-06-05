package ch9;

public class Box2<T> { // T (타입 변수) : Type Variable / E : Element 
	// 여러가지 타입의 객체를 담을 수 있는 변수 선언
	private T item;

	public Object getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}
