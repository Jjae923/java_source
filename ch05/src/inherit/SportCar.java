package inherit;

public class SportCar extends Car {

	@Override
	public void speedUp() {
		speed += 10; // private int speed; → private 붙어있기 때문에 불러올 수 없다
	}
	
	// final이 붙은 stop은 오버라이딩 금지

}
