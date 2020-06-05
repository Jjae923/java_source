package ch3;

import java.util.Scanner;

public class SwitchTest4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력(0 ~ 100) : ");
		int jumsy = sc.nextInt();
		char grade = ' ';
		switch (jumsy / 10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';
			break; // default에 break는 생략가능
		}
		System.out.println("등급은 :" +grade);

	}

}
