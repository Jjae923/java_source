package ch3;

import java.util.Scanner;

public class IfTest99 {

	public static void main(String[] args) {
		// 세 개의 숫자를 입력받은 후 가장 작은 수 구하기
		// if문으로 작성
		
		
		// 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Input Num2 : ");
		int num2 = sc.nextInt();
		System.out.print("Input Num3 : ");
		int num3 = sc.nextInt();
		
		//if
		int min = num1;
		if(min > num2) {
			min = num2;
		}
		if(min > num3) {
			min = num3;
		}
		System.out.println("제일 작은 수 : " +min);
		
		// (응용) 제일 큰 수
		System.out.print("Input Num4 : ");
		int num4 = sc.nextInt();
		System.out.print("Input Num5 : ");
		int num5 = sc.nextInt();
		System.out.print("Input Num6 : ");
		int num6 = sc.nextInt();
		
		int max = num4;
		if(max < num5) {
			max = num5;
		}
		if(max < num6) {
			max = num6; 
		}
		System.out.println("제일 큰 수 : " +max);
	}

}
