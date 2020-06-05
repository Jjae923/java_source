package ch2;

public class Trapezoid {

	public static void main(String[] args) {
		// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눠줄 때
		// 학생 당 몇개를 가질 수 있고 최종적으로 몇 개가 남는지 출력하기
		
		// 내가 푼거
		int x = 534, y = 30;
		
		int result = x / y;
		System.out.printf("학생 당 %d자루\n", result);
		
		result = x % y;
		System.out.printf("최종적으로 %d자루 남음\n",result);
		
		// 풀이
		int pencils = 534;
		int student = 30;
		
		System.out.printf("학생당 연필 수 : %d\t",(pencils/student));
		System.out.printf("나머지 연필 수 : %d\t",(pencils%student));
		
		

	}

}
