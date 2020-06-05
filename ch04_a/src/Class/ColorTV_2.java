package Class;

public class ColorTV_2 {
//	인스턴스변수(필드) - 속성 (사용하려는 용도)
	
//	이름
	int channel;	//초기값 : 0		//채널
	boolean power;	//초기값 : fasle	//전원
	String color;	//초기값 : null	//어떤색상을 가질 건지
//	로컬 변수 :  초기화 필요
//	인스턴스 변수 : 초기화는 되어 있음
	
//	메소드 - 동작
//	동작
	void power() {
		this.power =! this.power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
}
