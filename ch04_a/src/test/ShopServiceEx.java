package test;

public class ShopServiceEx {
	public static void main(String[] args) {
		ShopService service1 = ShopService.getInstance();
		ShopService service2 = ShopService.getInstance();
							//new 빼주고 .getInstance 변경

		// true가 나오도록
		System.out.println(service1 == service2);

	}

}
