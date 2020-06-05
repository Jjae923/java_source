package ch5;

public class TV {
	// 색상, 전원상태, 채널
	/* private */ String color;
	/* private */ boolean power;
	/* private */ int channel;
	
	
	// 전원 여부
	void pawer() {
		power=!power;
	}
	// 채널 변겅
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	

}
