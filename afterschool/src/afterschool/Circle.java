package afterschool;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		// 원의 면적 구하는 프로그램
		// double 변수를 하나 선언한 후 반지름 값 담기
		
		double r = 5;
		double circle = r*r*3.14;
		System.out.println(circle);
		
		
		// 풀이
		double radius = 5.0d; // d를 안써도 소수점을 붙이면 double타입으로 인식함
		System.out.println("원의 면적 : "+(radius*radius*Math.PI)); // Math.PI => 정확한 계산 값이 나오도록 함
		
		// 사용자에게 반지름을 입력받아 원의 면적을 구하는 프로그램
		
		Scanner sc = new Scanner(System.in); // 키보드를 통해서 받아들일게 @객체 선언@ // system.in(입력장치)=>키보드  & system.out(화면출력)=>모니터
		System.out.println("반지름 값을 입력해주세요.");
		double radius2 = sc.nextDouble();
		System.out.println("원의 면적 : "+radius2*radius2*Math.PI);
		
		
	}

}
