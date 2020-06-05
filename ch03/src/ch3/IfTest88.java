package ch3;

import java.util.Scanner;

public class IfTest88 {
	public static void main(String[] args) {
		// 근무시간을 사용자로부터 입력받아 시간제 임금을 계산하시오.
		// 8시간 까지는 시간당 9000원이고, 8시간 초과분에 대해서는 1.5배를 지급한다.
		
		//풀이
		Scanner sc = new Scanner(System.in);
		System.out.println("근무시간 : " );
		int hours = sc.nextInt();
		int pay = 0, rate = 9000; // 0은 초기화
		if(hours>8) {
			pay = (int) (rate * 8 + ((hours-8)* 1.5 * rate));
		}else {
			pay = hours * rate;
		}
		System.out.println("임금 : " +pay);
		

	}

}
