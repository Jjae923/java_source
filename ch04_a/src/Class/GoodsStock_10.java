package Class;

//삼품 재고 관리 클래스
public class GoodsStock_10 {
	String GoodsCode;	//상품코드 - "p-0001"...
	int stockNum;		//재고수량 - 30, 40...
	
//	생성자
	//기본생성자
	GoodsStock_10(){}
	
	//인자를 모두 받는 생성자
	GoodsStock_10(String GoodsCode, int stockNum) {
		this.GoodsCode = GoodsCode;
		this.stockNum = stockNum;
	}
	
	//메소드 - 동작(기능)
	//재고수량 +, 재고수량 - 기능을 추가
	void addStock(int stock) {
	//재고수량 증가 //재고수량 받음(30)
		this.stockNum += stock;
	}
	void subtractStock(int stock) {
	//재고수량 감소
		this.stockNum -= stock;
	}
	
}
