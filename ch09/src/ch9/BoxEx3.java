package ch9;

public class BoxEx3 {
	public static void main(String[] args) {
		Box3<Fruit> fruitBox = new Box3<Fruit>(); // Box3<Fruit> fruitBox = new Box3<>(); JDK7부터 허용
		Box3<Apple> appleBox = new Box3<Apple>(); // 어차피 오른쪽에 다른 타입 못담기 때문에 빈칸도 허용
		Box3<Toy> toyBox = new Box3<Toy>();
		
		fruitBox.add(new Fruit());	// 상속관계
		fruitBox.add(new Apple());	// 상속관계
		fruitBox.add(new Grape());	// 상속관계
//		fruitBox.add(new Toy());	// 상속관계X

		appleBox.add(new Apple());	// 자식은 O
//		appleBox.add(new Grape());	// 형제끼리는 X
	}
}
