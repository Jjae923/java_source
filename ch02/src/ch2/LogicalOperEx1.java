package ch2;

public class LogicalOperEx1 {

	public static void main(String[] args) {
		// 논리연산자 : &&(and), ||(or), !(not)
		int charCode = 'A';
		
		if((charCode>=65) && (charCode<=90)) { // A(65) ~ Z(90)이기 때문에 대문자인지 물어본 것
			System.out.println("대문자");
		}
		
		if((charCode < 48) && (charCode > 57)) { // 0(48) ~ 9(57) A가 65이기 때문에 앞조건부터 틀려서 컴퓨터는 뒤에 조건 계산X
			System.out.println("0~9 숫자");
		}
		
		int value = 6;
		if((value%2==0) || (value%3==0)) { // |=||랑 같으나 ||로 쓰는게 좋음
			System.out.println("2 또는 3의 배수");
		}

	}

}
