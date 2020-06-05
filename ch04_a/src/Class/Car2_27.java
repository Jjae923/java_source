package Class;

public class Car2_27 {
	String model;
	int speed;
	
	public Car2_27(String model) {
		super();
		this.model = model;
	}
	
	void setSpeed(int speed) { 
		this.speed = speed;
	}
	void run() {
		for (int i = 0; i <= 50; i+=10) {
			this.setSpeed(i);	//내가 가지고 있는 메소드라고 정확하게 표현
			System.out.println(this.model + " 가 달립니다.(시속 : " + this.speed + "km/h)");
		}
	}
}
