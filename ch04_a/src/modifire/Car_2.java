package modifire;
//복사본
public class Car_2 {

	private int speed;
	private String model;
	private String name;
	private int maxSpeed;
	
	//public Test
	public Car_2(int speed) {
		super();
		this.speed = speed;
	}
	
	//protected Test 
	protected Car_2(int speed, String model) {
		super();
		this.speed = speed;
		this.model = model;
	}
	
	//package Test
	Car_2(int speed, String model, String name) {
		super();
		this.speed = speed;
		this.model = model;
		this.name = name;
	}
	
	//private Test
	private Car_2(int speed, String model, String name, int maxSpeed) {
		super();
		this.speed = speed;
		this.model = model;
		this.name = name;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
}
