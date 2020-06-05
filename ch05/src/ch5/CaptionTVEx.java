package ch5;


public class CaptionTVEx {
	public static void main(String[] args) {
		
		CaptionTV captionTv=new CaptionTV();
		
		captionTv.channel=9;
		captionTv.color="black";
		captionTv.power=false;
		
		// 부모(super) 메소드 접근
		captionTv.channelUp();
		System.out.println("현재 채널 : "+captionTv.channel);
		
		// 자식(본인-sub) 메소드 접근
		captionTv.displayCaption("Hello World");
		// 자식 속성 접근
		captionTv.caption=true;
		captionTv.displayCaption("Hello World2222");
		
		
		
	}

}
