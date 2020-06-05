package Class;

public class CardEx_32 {
	public static void main(String[] args) {
		Card_31 card1 = new Card_31();
		card1.kind = "heart";
		card1.number = 7;
		System.out.println("카드 종류 : " + card1.kind + ",\t\t카드 번호 : " + card1.number);
		System.out.println("가로 길이 : " + Card_31.width + ",\t\t세로 길이 : " + Card_31.height);	//class.width, height 접근
		
		
		Card_31 card2 = new Card_31();
		card2.kind = "spade";
		card2.number = 6;
		System.out.println("카드 종류 : " + card2.kind + ",\t\t카드 번호 : " + card2.number);
		
		
		Card_31 card3 = new Card_31();
		card3.kind = "diamond";
		card3.number = 8;
		System.out.println("카드 종류 : " + card3.kind + ",\t카드 번호 : " + card3.number);
		
	}
	
}
