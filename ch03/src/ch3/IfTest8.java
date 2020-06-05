package ch3;

import java.util.Scanner;

public class IfTest8 {
	public static void main(String[] args) {
		// 근무시간을 사용자로부터 입력받아 시간제 임금을 계산하시오.
		// 8시간 까지는 시간당 9000원이고, 8시간 초과분에 대해서는 1.5배를 지급한다.
		
		// 내가 푼 거
		Scanner sc = new Scanner(System.in);
		System.out.println("근무시간 : " );
		int pay = sc.nextInt();
		
		if(pay<=8) {
			System.out.println(pay*9000);
		}else if(pay>8){
			System.out.println(((pay-8)*9000*1.5)+72000);
		}
		

	}

}
