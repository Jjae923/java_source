package ch3;

import java.util.Scanner;

public class SwitchTest5 {
	public static void main(String[] args) {
		// 사용자로부터 사칙 연산 기호 및 두 개의 숫자를 입력받아
		// 계산 후 출력하는 프로그램 작성
		// +, -, *, /

		Scanner sc = new Scanner(System.in);
		
		System.out.print("필요한 사칙연산(+, -, *, /, %) 기호를 입력하세요 : ");
		String op = sc.nextLine(); // 문자열로 받기
		
		// 두 개의 숫자 입력받기
		System.out.print("첫번째 피연산자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 피연산자 입력 : ");
		int num2 = sc.nextInt();
		int result = 0;
		
		switch(op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			System.out.println("연산자 기호를 확인해 주세요");
			break;
		}
		System.out.printf("%d %s %d = %d", num1, op, num2, result);

	}

}
