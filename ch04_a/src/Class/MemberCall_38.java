package Class;

public class MemberCall_38 {
	//인스턴스 변수, 필드, 멤버변수...
	int iv = 10;			//new로 생성하지 않는 이상 어디에 있는지 모른다
	//정적변수, 정적필드, 클래스 변수
	static int cv = 20;		//저장 하는 순간 올라가 있다(어디에? 메모리)
	
//	static int cv2 = iv;	//iv 불가능
	static int cv2 = new MemberCall_38().iv;	//new로 생성을 해줘야 사용 가능
	
	static void staticMethod1() {
		System.out.println(cv);
		System.out.println(cv2);
//		System.out.println(iv);		//불가 - 객체 생성이 안되어 있기 때문
	}
	
	
	//static 메소드 안에서는 인스턴스 메소드 사용불가
	
	//인스턴스메소드 안에서는 인스턴스변수 사용가능
	//클래스 변수 사용가능
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);		//가능
	}

}
