package ch6;

public class RemoteControlEx {
	public static void main(String[] args) {
		
		RemoteControl television = new SmartTv(); // Television television = new Television(); 와 컴파일 결과 동일함 (다형성)
		television.turnOn();
		television.setVolume(5);
		television.turnOff();
		
		// 익명구현객체방식
		// 실제로 인터페이스를 구현하는 객체를 생성하지않고 1회성으로 사용하는 방식
		RemoteControl rc = new RemoteControl() { 
			
			@Override
			public void turnOn() {
				System.out.println("켭니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("끕니다");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("현재 볼륨 : "+volume);
				
			}
		}; // 익명 구현 
		
		// 사용
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}
