package modifire;

public class PersonEx {
	public static void main(String[] args) {
		Person_4 person = new Person_4("010209", "hong");

		// 일반변수
		person.name = "kang";

		// ★ final이기 때문에 초기화 값을 변경 할 수 없다
//		person.nation = "America";

		// final도 부를 때는 문제 없음
		person.print();
		person.print2();

	}
}
