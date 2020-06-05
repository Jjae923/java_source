package poly;

public class CaptionTV extends TV {


	/* private */ boolean caption;   // 캡션 상태
	

	public CaptionTV() {
		super();
	}

//	public CaptionTV(String color, boolean power, int channel, boolean caption) {
//		super(color, power, channel);
//		this.caption=caption;
//	}

	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
		
	}

}
