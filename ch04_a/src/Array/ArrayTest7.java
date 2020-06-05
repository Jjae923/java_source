package Array;

public class ArrayTest7 {
	public static void main(String[] args) {
//		1~45번호 생성 후 배열에 담기
		int card[] = new int[45];
		for (int i = 0; i < card.length; i++) {
			card[i] = i+1;
		}
		
		for (int i : card) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		//카드 섞기
		for (int i = 0; i < card.length; i++) {
			//임의의 위치
			int pos = (int)(Math.random()*45);
			int temp = card[i];		//int temp(0) = card[0]
			card[i] = card[pos];	//card[i](45) = card[pos](45)
			card[pos] = temp;		//card[pos](45) = temp(0)	
		}
		
		for (int i : card) {
			System.out.print(i + " ");
		}
		
	}
}
