package afterschool;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		// 사용자의 입력값이 1이거나 3이면 남자라고 출력
		// 사용자의 입력값이 2이거나 4이면 여자라고 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~4 사이의 수를 입력하세요");
		int num = sc.nextInt();
		if(num==1||num==3) {
			System.out.println("남자");
		}else if(num==2||num==4) {
			System.out.println("여자");
		}else {
			System.out.println("잘못 입력했습니다");
		}

	}

}
