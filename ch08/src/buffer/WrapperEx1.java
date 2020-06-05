package buffer;

public class WrapperEx1 {
	public static void main(String[] args) {
		// 랩퍼 클래스 : 기본형 타입을 객체로 다루는 클래스
		
		// boolean : Boolean
		// char : Character
		// byte : Byte
		// short : Short
		// int : Integer
		// long : Long
		// float : Float
		// double : Double
		
		boolean b1 = true;
		Boolean b2 = new Boolean(false);
		Boolean b3 = new Boolean("false");
		Boolean b4 = true;
		
		int i1 = 10;
		Integer i2 = new Integer(20);
		Integer i3 = 30;

		int i4 = i2; // 기본타입과 객체타입은 저장공간이 다르지만 버전 5부터 허용

		// 문자열을 숫자로 변경해주기 ★가장 유용함★
		System.out.println(Integer.parseInt("100"));
		System.out.println(Float.parseFloat("100.14"));
		System.out.println(Double.parseDouble("100.14"));
		System.out.println(Byte.parseByte("100"));
		System.out.println(Long.parseLong("10"));
	}
}
