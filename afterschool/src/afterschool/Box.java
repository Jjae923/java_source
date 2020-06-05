package afterschool;

import java.util.Scanner;

public class Box {
	public static void main(String[] args) {
		// 사각형의 가로 및 세로 길이를 입력받아
		// 사각형의 넓이와 둘레를 구하는 프로그램 작성
		
		// 넓이 : 가로x세로
		// 둘레 : 2*(가로+세로)
		// 가로와 세로는 변수 사용하기
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("가로 길이를 입력하세요.");
		int x = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("세로 길이를 입력하세요.");
		int y = sc2.nextInt();
		
		System.out.println("사각형의 넓이 : "+(x*y));
		System.out.println("사각형의 둘레 : "+(2*(x+y)));
		
		
		// 풀이
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 길이를 입력하세요.");
		double width = sc1.nextDouble();
		System.out.println("세로 길이를 입력");
		double height = sc1.nextDouble();
		System.out.println("사각형의 넓이 : "+(width*height));
		System.out.println("사각형의 둘레 : "+(2*(width+height)));
		
		
	}

}
