package Class;

public class ColorTVEx_4 {
	public static void main(String[] args) {
//		객체 생성
		ColorTV_2 tv = new ColorTV_2();
//					 new (생성)
//		기본 생성자는 생성자가 하나도 없을 때는
//		컴파일러가 자동 생성 → 인자를 받지 않는 default 생성자 (기본 생성자로 만들어줌)
//		ColorTV 클래스에 기본 생성자가 없어도
//		객체 생성시 에러가 나지 않음
		

		tv.channel = 7;
		tv.color = "black";
		tv.power = true;
		tv.power = true;
		tv.channelDown();	// channelDown을 호출한다
		System.out.println("현재 채널 : " + tv.channel);
		
		
	}
}
