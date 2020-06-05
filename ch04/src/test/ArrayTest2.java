package test;

import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		// Member 객체 배열을 생성
		Member members[] = new Member[];
//		members[0] = new Member("홍길동", "hong123");
//		members[1] = new Member("김수지", "kim123");
//		members[2] = new Member("차돌이", "cha123");
				
		// 사용자로부터 생성(Member)할 갯수 입력받기
		// 입력받은 숫자만큼 Member객체 배열 생성
		// 생성 후 출력
		
		Scanner sc = new Scanner(System.in);
		int members[] = null;
		
		System.out.println("생성하고자하는 member 배열의 갯수 입력 : ");
		int size = sc.nextInt();
		members = new members[size];	
		
		for(int i=0;i<members.length;i++) {
			System.out.printf("%d번째 요소 name 입력 : ",(i+1));
			String name=sc.next();
			System.out.printf("%d번째 요소 name 입력 : ",(i+1));
			String id=sc.next();
			members[i]=new Member(name, id);
		}
		
		for()
		
	}

}
