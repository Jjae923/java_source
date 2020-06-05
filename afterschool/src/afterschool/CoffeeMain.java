package afterschool;

public class CoffeeMain {
	public static void main(String[] args) {
		// 800원은 커피가 몇 잔일까요?를 구하는 프로그램 작성
		// 커피 한잔의 가격 200원
		
		// 800원 변수 선언, 200원 변수 선언
		// 현재 가지고 있는 돈이 0보다 큰지 확인한 후
		// 커피 잔 수 구하기
		// 가지고 있는 돈이 0이면 커피 잔 수는 0이 출력되도록 하고
		// 가지고 있는 돈이 없다면 -1이 출력되도록 한다.
		
		double money = 800;
		double coffee = 200;
		
		if(money>0) {
			System.out.println(money/coffee+"잔");
		}else if(money==0) {
			System.out.println(0);
		}else{
			System.out.println(-1);
		}
		
		// 풀이
		int money2 = 800;
		int coffee2 = 200;
		int cups = 0;
		
		if(money>0) {
			cups = money2/coffee2;
		}else if(money==0) {
			cups = 0;
		}else{
			cups = -1;
		}
		if (cups>0) {
			System.out.println("커피가 "+cups+"잔 입니다.");
		}else {
			System.out.println("액수가 모자랍니다.");
		}

	}

}
