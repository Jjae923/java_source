package poly;

public class AnimalEx {
	public static void main(String[] args) {	
		Cat cat = new Cat();
		System.out.println();
		
		// 자동 형변환이 일어남 (자식객체가 부모객체에 담길 때)
		Animal animal = new Cat();
		// Cat cat1 = new Dog();
		System.out.println();
		Feline feline1 = new Cat();
		
		
		
		
		// 강제 형변환 ClassCastException
		Feline feline2 = (Feline) new Animal();

	}

}

