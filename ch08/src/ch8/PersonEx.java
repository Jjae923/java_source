package ch8;

public class PersonEx {
	public static void main(String[] args) {

		Person person1 = new Person("gooreumseng", "하성운");
		Person person2 = new Person("gooreumseng", "하성운");
		Person person3 = new Person("gooreumseng", "배인혁");
		
		System.out.println(person1.equals(person2));  // true
		System.out.println(person1.equals(person3));  // false
		
		// toString을 안써줘도 호출 가능
		System.out.println(person1.toString());		// Person [id=gooreumseng, name=하성운]
		System.out.println(person2);				// Person [id=gooreumseng, name=하성운]
	}
}
