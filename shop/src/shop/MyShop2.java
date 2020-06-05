package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop2 implements Ishop { // 리스트

	private String title;     // 상점 이름 보관
	private List<User> users = new ArrayList<User>();
//	private User[] users = new User[2];
	private List<Product> products = new ArrayList<Product>();
//	private Product[] products = new Product[5];
	private Scanner sc = new Scanner(System.in);
	private List<Product> carts = new ArrayList<Product>(); // 장바구니
//	private Product[] carts = new Product[10];
	private int costomer; // 메인화면에서 선택된 사용자 값 담는 변수
	private List<Product> select = new ArrayList<Product>(); // 제품리스트에서 구매상품 담는 리스트
//	private Product[] select = new Product[10];
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// User 객체를 사용하여 쇼핑몰 이용자 생성
		users.add(new User("홍길동",PayType.CARD));
		users.add(new User("블로거",PayType.CASH));
	}

	@Override
	public void genProduct() {
		// CellPhone(3),SmartTV(2) 객체를 사용해서 제품 생성
		products.add(new CellPhone("갤럭시20", 1500000, "SKT"));
		products.add(new SmartTV("삼성 3D SmartTV", 2000000, "1260x960"));
		products.add(new CellPhone("아이폰11 pro", 1800000, "KT"));
		products.add(new CellPhone("아이폰 SE2", 900000, "LGU"));
		products.add(new SmartTV("LG 3D SmartTV", 1900000, "1920x960"));
	}
	
	@Override
	public void start() {
		System.out.println(title+" : 메인 화면 - 계정선택");
		System.out.println("==============================");
//		System.out.println(user[0].getName()+user[0].getPayType()); // 이걸로 두번쓰거나
		int i=0; // 향상된 for문
		for(User user:users) {
			System.out.printf("[%d] %s(%s)\n",i++,user.getName(),user.getPayType());
		}
		System.out.println("[X] 종  료");
		System.out.print("선택 : ");
		String input = sc.next();  // input => 0,1,X 셋 중 하나
		System.out.print("## "+input+"선택 ##");
		
		// 0,1이면  productList 메소드 호출
		// X이면 현재 프로그램 종료                     ===> switch문 혹은 if문으로 가능
//		// 내가 푼거(if문)
		if(input.equals("0") || input.equals("1")) {
			costomer = Integer.parseInt(input);
			productList();
		}else if(input.equals("x") || input.equals("X")) {
			System.out.println("\nshop을 종료합니다.");
		}else {
			System.out.println("잘못 입력하셨습니다. \n다시 입력해주세요");
			start();
		}
//		// 쌤풀이(switch문)
//		switch (input) {
//		case "0":case "1":
//			productList();
//			break;
//		case "x":case "X":
//			System.out.println("shop을 종료합니다.");
//			break;
//		default:
//			System.out.println("\n입력 값을 확인해 주세요.\n");
//			start();
//			break;
//		}
	}
	public void productList() {
		System.out.println("\n"+title+" : 상품목록 - 상품 선택");
		System.out.println("==============================");
		int i = 0;
		for(Product p:products) {
			System.out.printf("[%d]",i++);
			p.printDetail();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
		String sel = sc.next();   // 상품번호, h, c 세가지 
		
		// 상품번호가 입력되면 장바구니에 해당 상품 담기
		// h가 입력되면 메인화면 보여주기
		// c가 입력되면 checkOut() 메소드를 호출
//		// 내가 푼거(if문)
//		if(sel.equals("0")||sel.equals("1")||sel.equals("2")||sel.equals("3")||sel.equals("4")) {
//			for (int j = 0; j < carts.size(); j++) {
//				if (carts.get(j) == null) {
//					carts[j] = products.get(Integer.parseInt(sel));
//					
//					System.out.println("장바구니에 "+sel+"번 상품이 담겼습니다.");
//					productList();
//					break;
//				}
//			}
//		}else if(sel.equals("h")) {
//			start();
//		}else if (sel.equals("c")) {
//			checkOut();
//		}else {
//			System.out.println("잘못 입력하셨습니다. \n다시 입력해주세요");
//			productList();
//		}
//	}
//		// 쌤풀이(switch문)
		switch(sel) {
		case "h" :
			start();
			break;
		case "c" :
			checkOut();
			break;
		case "0" : case "1" : case "2" : case "3" : case "4" :
			carts.add(products.get(Integer.parseInt(sel)));
			productList();
			break;
		default:
			System.out.println("입력값을 확인해주세요");
			break;
			}
		}
	public void checkOut() {
		// 장바구니에 담아놓은 제품 목록 보여주기
		System.out.println("\n"+title+" : 체크아웃");
		System.out.println("==============================");
		int i = 0;
		int sum = 0;
		for(Product p:carts) {
			if(p!=null) {
				System.out.printf("[%d] %s (%d)\n",i++,
						p.getPname(),p.getPrice());
				sum+=p.getPrice();
			}
		}
		System.out.println("==============================");
		System.out.println("결제 방법 : "+users.get(costomer).getPayType());
		System.out.println("합계 : "+sum);
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.println("선택 : ");
		String last = sc.next();
		switch(last) {
		case "p" :
			productList();
			break;
		case "q" :
			System.out.println("결제완료 되었습니다.");
			break;
		default :
			checkOut();
		}
	}
}
