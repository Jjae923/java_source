package modifire;

public class Car2 {

	// private 외부에서 보이지 않는다
	private int speed;
	private boolean stop;

//	생성자를 이용해서 값을 주는 방법
//	geter, seter를 이용해서 준다
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isStop() { 		// is : boolean 타입만 쓴다
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
