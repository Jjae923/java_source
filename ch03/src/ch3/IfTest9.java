package ch3;

import java.util.Scanner;

public class IfTest9 {

	public static void main(String[] args) {
		// 세 개의 숫자를 입력받은 후 가장 작은 수 구하기
		// if문으로 작성
		
		
		// 내가 푼 거
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int b = sc.nextInt();
		System.out.print("세번째 숫자 : ");
		int c = sc.nextInt();
		
		if(a<b && a<c) {
			System.out.println("가장 작은 수 : " +a);
		}else if(b<a && b<c) {
			System.out.println("가장 작은 수 : " +b);
		}else {
			System.out.println("가장 작은 수 : " +c);
		}
		
		
	}

}
