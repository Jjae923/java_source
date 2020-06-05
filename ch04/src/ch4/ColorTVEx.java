package ch4;

public class ColorTVEx {
	public static void main(String[] args) {
		
		// 객체 생성 ---> 무조건 생성자 호출
		ColorTV tv = new ColorTV(); // new에 생성의 의미가 있기 때문에 new 다음에 오는 애가 중요
		// 기본(default) 생성자는 생성자가 하나도 없을 때는 컴파일러가 자동 생성함
		// ColorTV 클래스에 기본 생성자가 없어도 객체 생성 시 에러가 나지 않음
		
		
		// 객체 사용
		tv.channel = 7;
		tv.color = "black";
		tv.power = true;
		tv.channelDown();
		System.out.println("현재 채널 : "+tv.channel);

	}

}
