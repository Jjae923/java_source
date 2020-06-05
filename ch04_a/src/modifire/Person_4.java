package modifire;

/*final
 * 1. 클래스 앞에 final이 붙는 경우		: 상속금지
 * 2. 인스턴스 변수 앞에 final이 붙는 경우	: 초기화 후 변경 금지
 * 3. 메소드 앞에 final이 붙는 경우		: 오버라이딩 금지
*/
public /* final */ class Person_4 {
	// ★ final로 선언된 인스턴스 변수는 무조건 초기화 필요
	final String nation = "korea";
	final String ssn;
	String name;

	// 초기화 상황
	public Person_4(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	// ★ 메소드 앞에 파이널이 붙으면 오버라이딩 금지
	final void print() {
		System.out.println("final method()");
	}

	void print2() {
		System.out.println("인스턴스 메소드");
	}

}
