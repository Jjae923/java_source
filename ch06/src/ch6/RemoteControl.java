package ch6;

public interface RemoteControl {
	// 모든 멤버변수는 public static final 이어야 하며
	// 생략 가능
	public int MAX_VOLUME = 10; // fanal은 상수, 상수는 대문자로 표현
	public int MIN_VOLUME = 0;
	
	// 모든 메소드는 public abstract 이어야 하며
	// 생략 가능 (단, static/default 제외)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// 기능 추가 (기능 추가 시 static/default로 하면 자식클래스는 문제X)
	public default void setMute() {}

}
