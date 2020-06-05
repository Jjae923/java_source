package classtest;

public class Person {
	// 속성 - 이름, 키, 몸무게, 주소   // 멤버변수=인스턴스변수=필드
	private String name;
	private double heigt;
	private double weight;
	private String address;
	
	
	// 생성자
	public Person() {
		super();
	}

	public Person(String name, double heigt, double weight, String address) {
		super();
		this.name = name;
		this.heigt = heigt;
		this.weight = weight;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeigt(double heigt) {
		this.heigt = heigt;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public double getHeigt() {
		return heigt;
	}

	public double getWeight() {
		return weight;
	}

	public String getAddress() {
		return address;
	}
	
	
	
	
	
}
