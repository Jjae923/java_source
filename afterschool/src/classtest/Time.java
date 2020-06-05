package classtest;

public class Time {
	// 속성 : 시, 분, 초
	// 생성자 : 기본 생성자, 인자를 받는 생성자
	
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		super();
	}
	
	// hour 0~23 사이로 들어왔는지 확인한 후 초기화
	// minute 0~59 사이로 들어왔는지 확인한 후 초기화
	// second 0~59 사이로 들어왔는지 확인한 후 초기화
	public Time(int hour, int minute, int second) {
		super();
		this.hour = ((0<=hour && hour<24)? hour : 0 );
		this.minute = ((0<=minute && minute<60)? minute : 0 );
		this.second = ((0<=second && second<60)? second : 0 );
		
		
//		if(0<=hour && hour<24) {
//			this.hour = hour;
//		}else {
//			hour=0;
//		}
//		if(0<=minute && minute<60) {
//			this.minute = minute;
//		}else {
//			minute=0;
//		}
//		if(0<=second && second<60) {
//			this.second = second;
//		}else {
//			second=0;
//		}
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}
	
	

}
