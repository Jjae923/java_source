package modifire;

public class Singleton_3 {

	private static Singleton_3 singleton;	//변수 선언
	//객체를 하나로만 쓰자(통로를 하나만 만들어서 사용하겠다)
	
	private Singleton_3() {	//외부에서 Singleton_3을 생성 할 수 없다 
		super();
	}
	
	//하나 생성되어 있는 객체를 무조건 하나만 제공
	static Singleton_3 getInstance() {
		if (singleton == null) {
			singleton = new Singleton_3();	//새로 만듬
		}
		return singleton;
	}
}
