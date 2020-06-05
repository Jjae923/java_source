package ch2;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// 사용자로부터 숫자를 입력받아 홀수인지 짝수인지를 출력해주는 프로그램을 작성
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		
		String result = num%2 == 0 ? "짝수":"홀수";
		System.out.println(result);
	

	}

}
