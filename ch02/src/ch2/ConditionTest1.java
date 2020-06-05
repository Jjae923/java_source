package ch2;

import java.util.Scanner;

public class ConditionTest1 {

	public static void main(String[] args) {
		// 사용자가 입력한 숫자가 양수, 음수, 0인지 구분하는 프로그램을 작성
		// 삼항 연산자 이용할 것
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		
		
		// 내가 푼 것
		String result = num*1 == 0 ? "0" : num*1 == -num ? "음수" : "양수";
		System.out.println(result);
		
		
		// 풀이
		String result1 = num > 0 ? "양수" : num < 0 ? "음수" : "0";
		System.out.println(result1);
		
	}

}
