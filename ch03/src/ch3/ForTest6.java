package ch3;

import java.util.Scanner;

public class ForTest6 {
	public static void main(String[] args) {
		// 숫자를 입력받아 해당 숫자의 factorial 값 구하기
		// 5! => 5*4*3*2*1
		
		
		//내가 푼 거
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int fac = sc.nextInt();
		for(int i=1; i<=fac; i*=i++) {
			fac*=i;
		}
		System.out.println("factorial값 : " +fac);
		
		
		//풀이
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=num; i++) { // int i=1 /엔터/ for(;i<=num;) { /엔터/ 실행문 / i++; 가능
			fact*=i; // fact=fact*i
		}
		System.out.printf("%d! = %d", num, fact);
		
	}

}
