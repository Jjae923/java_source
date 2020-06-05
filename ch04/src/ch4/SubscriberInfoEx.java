package ch4;

public class SubscriberInfoEx {
	public static void main(String[] args) {
		
		SubscriberInfo info1 = new SubscriberInfo("하성운","gooreumseng","seng322","010-1994-0322","일산");
		System.out.println(info1);
		
		SubscriberInfo info2 = new SubscriberInfo("황민현","minhyun","hwang");
		System.out.println(info2);
		info2.chtel("010-4589-1651");
		info2.chaddr("서울");
		System.out.println(info2);		
		

	}

}
