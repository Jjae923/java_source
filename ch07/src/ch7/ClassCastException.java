package ch7;

public class ClassCastException {
	public static void main(String[] args) {

		Animal animal1 = new Dog();
		
		Dog dog1 = (Dog) animal1;

		Animal animal2 = new Animal();
		
		Dog dog2 = (Dog) animal2;
	}

}
