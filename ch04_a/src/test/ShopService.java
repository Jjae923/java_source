package test;

public class ShopService {
//	ShopService의 여러 객체를 외부에서 생성해도
//	항상 동일한 하나의 객체가 생성되도록 하기

	private static ShopService singleton;

	// 무한으로 만들기 때문에 객체 생성을 못하도록 무조건 막아야 한다
	private ShopService() {
		super();
	}

	static ShopService getInstance() {
		if (singleton == null) {
			singleton = new ShopService();	//null 일 때만 new를 한다
		}
		return singleton;
	}

}
