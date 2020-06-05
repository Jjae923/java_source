package ch2;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// 사용자로부터 화씨온도를 입력받아 섭씨온도로 변경하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨 온도 입력 : ");
		int fahr = sc.nextInt();
		// 섭씨온도 = (화씨온도-32) * 5/9
		
		// 내가 푼 거
		int result = (fahr-32) * 5 / 9;
		System.out.println("섭씨 온도 : "+result);
		
		
		// 풀이
		double celsius = (fahr-32) * 5 / (double)9;
		System.out.println("변환된 섭씨 온도 : "+celsius);
	}

}
