package inherit;

public class TV {
	// 색상, 전원상태, 채널
	/* private */ String color;
	/* private */ boolean power;
	/* private */ int channel;
	
	public TV(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
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
	
	protected void print() {
		System.out.println("protected 메소드");
	}
	

}
