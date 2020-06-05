package other;

import inherit.TV; // 다른 패키지일 경우 표기
// 다른 패키지에 있는 클래스를 상속받는 경우
// default 접근 제한자 메소드는 오버라이딩 불가
// protected 접근 제한자 메소드만 오버라이딩 가능

public class CaptionTV extends TV {

	public CaptionTV(String color, boolean power, int channel) {
		super(color, power, channel);
	}
	
	@Override
	protected void print() {
		// TODO Auto-generated method stub
		super.print();
	}

}
