package ch2;

public class Trapezoid2 {

	public static void main(String[] args) {
		// 사다리꼴의 넓이 구하기
		
		// 윗변, 아랫변, 높이에 해당하는 변수를 선언한 뒤
		// 계산한다.
		
		// 내가 푼거
		int x = 10, y = 5, h=8;
		
		int result = (x + y)*h /2;
		System.out.printf("사다리꼴의 넓이 = %d\n", result);
		
		// 풀이
		int top = 5;
		int bottom = 10;
		int height = 7;
		
		//(윗변+아랫변)*높이/2
		int result1 = (top+bottom)*height / 2;
		System.out.println("사다리꼴 넓이 : "+result1);
		
		double result2 = (double)(top+bottom)*height / 2;
		System.out.println("사다리꼴 넓이 : "+result2);
		
		double result3 = (top+bottom)*height / 2.0;
		System.out.println("사다리꼴 넓이 : "+result3);

	}

}
