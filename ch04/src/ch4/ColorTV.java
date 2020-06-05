package ch4;

public class ColorTV {
	
	//인스턴스변수(필드) - 속성
	
	int channel; // int의 초기값 : 0
	boolean power; // boolean의 초기값 : false
	String color; // String의 초기값 : null
	
	//
	
	//메소드 - 동작
	
	void power() {
		this.power=!this.power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
