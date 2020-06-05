package test;


import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		// Member 객체 배열을 생성
		Member members[] = new Member[3];
		members[0] = new Member("홍길동", "hong123");
		members[1] = new Member("김수지", "kim123");
		members[2] = new Member("차돌이", "cha123");
		
		// 사용자로부터 생성(Member)할 갯수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		// 입력받은 숫자만큼 Member 객체 배열 생성

		// 생성 후 출력

	}
}
