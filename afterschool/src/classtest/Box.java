package classtest;

public class Box {
	// 속성 : 가로, 세로, 높이
	private int x;
	private int y;
	private int h;
	
	// 기본 생성자, 인자를 받는 생성자
	public Box() {
		super();
	}
	public Box(int x, int y, int h) {
		super();
		this.x = x;
		this.y = y;
		this.h = h;
	}
	
	// 메소드 getVolume() => 가로*세로*높이
	public int getVolume() {
		return x*y*h;
	}

}
