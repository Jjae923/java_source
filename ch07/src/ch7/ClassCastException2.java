package ch7;

public class ClassCastException2 {
	public static void main(String[] args) {

		Animal animal1 = new Dog();
		changeDog(animal1);
		Animal animal2 = new Animal();
		changeDog(animal2);
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog1 = (Dog) animal;
		} 
	}
}
