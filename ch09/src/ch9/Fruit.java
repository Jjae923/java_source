package ch9;

// class를 여러개 만들 때 주의점 : public은 하나만 작성

public class Fruit {
	@Override
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	@Override
	public String toString() {
		return "Grape";
	}
}

class Toy{
	@Override
	public String toString() {
		return "Apple";
	}
}
