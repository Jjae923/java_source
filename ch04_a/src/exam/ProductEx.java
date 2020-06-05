package exam;

public class ProductEx {
	public static void main(String[] args) {
		// 객체 3개
		// 인자를 모두 받는 생성자를 이용해서 객체 생성

		// 출력
		Product_4 product[] = new Product_4[5];

		product[0] = new Product_4("11", "일", "1성", 1, 50);
		product[1] = new Product_4("21", "이", "2성", 2, 40);
		product[2] = new Product_4("31", "삼", "3성", 3, 30);
		product[3] = new Product_4("41", "사", "4성", 4, 20);
		product[4] = new Product_4("51", "오", "5성", 5, 10);

		for (Product_4 pd : product) {
			System.out.println(pd.pCode + "\t");
			System.out.println(pd.pName + "\t");
			System.out.println(pd.company + "\t");
			System.out.println(pd.price + "\t");
			System.out.println(pd.discount + "\n");
		}
		print(product[0]);
		print(product[1]);
		print(product[2]);
	}
	static void print(Product_4 p) {
		
	}
		
}
