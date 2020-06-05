package Class;

//삼품 재고 관리 클래스
public class GoodsStockEx_11 {
	public static void main(String[] args) {

		GoodsStock_10 goods1 = new GoodsStock_10("p-001", 30);
		
		GoodsStock_10 goods2 = new GoodsStock_10("p-002", 50);

		System.out.printf("%s 의 현재 재고 수량 : %d\n", goods1.GoodsCode, goods1.stockNum);
		System.out.printf("%s 의 현재 재고 수량 : %d\n", goods2.GoodsCode, goods2.stockNum);
		
//		goods1.stockNum += 30;	// 바뀔 때마다 매번 변경 해줘야 한다
		
		//p-001 상품의 재고 추가
		goods1.addStock(30);
		System.out.printf("%s 의 현재 재고 수량 : %d\n", goods1.GoodsCode, goods1.stockNum);
		
		//p-002 상품의 재고 추가
		goods2.addStock(70);
		System.out.printf("%s 의 현재 재고 수량 : %d\n", goods2.GoodsCode, goods2.stockNum);
		
		//p-002 상품의 재고 감소
		goods2.subtractStock(30);
		System.out.printf("%s 의 현재 재고 수량 : %d\n", goods2.GoodsCode, goods2.stockNum);
		
	}
}
