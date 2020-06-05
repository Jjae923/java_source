package test;

import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 피연산자 입력 : ");
		int op1=sc.nextInt();
		System.out.print("+ - * / % 중에서 하나를 선택");
		String oper=sc.nextLine(); // .next는 엔터친거는 인식안함(특정문자열만 인식) / .Line은 줄단위로 인식 
		System.out.println("두번째 피연산자 입력 : ");
		int op2=sc.nextInt();
		
		
	}

}
