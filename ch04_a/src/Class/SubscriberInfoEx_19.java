package Class;

public class SubscriberInfoEx_19 {
	public static void main(String[] args) {
		SubscriberInfo_18 info1 = new SubscriberInfo_18("홍길동", "hong123", "hong123@", "010-2222-5588", "dd");
		System.out.println(info1);	//@Override 필요한 상황
		SubscriberInfo_18 info2 = new SubscriberInfo_18("성춘향", "Song123", "Song123@");
		System.out.println(info2);	//@Override 필요한 상황	
		//내용 추가 부분
		info2.changeTel("010-6548-2183");
		info2.changeAddr("경기도");
		System.out.println(info2);	//info2 이것만 써줬기 때문에 @Override toString 필요한 상황 → info2.
	}
}
