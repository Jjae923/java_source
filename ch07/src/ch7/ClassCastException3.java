package ch7;

public class ClassCastException3 {
	public static void main(String[] args) {

		try {
			Animal animal1 = new Dog();
			Dog dog1 = (Dog) animal1;
			Animal animal2 = new Animal();
			Dog dog2 = (Dog) animal2;
		} catch (Exception e) {
			System.out.println("타입 변환 불가능합니다.");
		}
	}

}
