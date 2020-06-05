package ch8;

public class Value {
	
	private int value;

	public Value(int value) {
		super();
		this.value = value;
	}
	
	//Object obj = value2;
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Value) {  // classcastexception 나오는 경우를 없애주는 instanceof
			Value v = (Value) obj;
			return this.value == v.value;
		}
		return false;
	}
	
	@Override
	public String toString() { // 멤버변수의 값을 문자열로 리턴(하는 형태로 많이 씀)
		return "[value = "+value+"]";
	}
}
