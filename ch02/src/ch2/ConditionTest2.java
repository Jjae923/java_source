package ch2;

import java.util.Scanner;

public class ConditionTest2 {

	public static void main(String[] args) {
		char ch1 = 'z';
		// ch1이 영문자(대문자 또는 소문자)이거나 숫자일 때만
		// 변수 b의 값이 true가 나오는 프로그램 작성하기
		// boolean b =
		
		// 내가 푼거 오류남~~~~
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ch0 = ");
//		int ch0 = sc.nextInt();
//				
//		b = if((ch1>=65) && (ch1<=90) || (ch1>=97) && (ch1<=122) || (ch1>=48) && (ch1<=57))
//		System.out.println(b);
//		
//		if((ch0>=65) && (ch0<=90) || (ch0>=97) && (ch0<=122) || (ch0>=48) && (ch0<=57)) {
//			System.out.println("b = true");
//		}
//				
		
		// 풀이		
		boolean b = (ch1>='A' && ch1<='Z') ||
					(ch1>='a' && ch1<='z') ||
					(ch1>=48 && ch1<=57) ? true : false;
		System.out.println(b);
		
		boolean b2 = (ch1>=65 && ch1<=90) ||
					(ch1>=97 && ch1<=122) ||
					(ch1>=48 && ch1<=57) ? true : false;
		System.out.println(b2);
	}

}
