package ch4;

public class CalcEx {
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		
		//add 메소드 호출
		int result = calc.add(5,7); // return result; 받는 방식
		System.out.println(result);
		
		result = calc.add(12,6);
		System.out.println(result);

		result = calc.add(18,19);
		System.out.println(result);
		
		System.out.println(calc.add(24, 35));
		
		
		//subtrack 메소드 호출
		System.out.println(calc.subtrack(15, 12));
		System.out.println(calc.subtrack(8, 6));
		System.out.println(calc.subtrack(5, 3));
		
		
		//리턴없는 메소드 호출
		calc.powerOn();
//		int a = calc.powerOn(); // 리턴받는 방식이기 때문에 호출 안됨
//		System.out.println(calc.powerOn()); // 리턴되어 오는 값을 출력하는 문구이기 때문에 출력 불가능
		
		
		//divede 메소드 호출
		System.out.println(calc.divide(10, 3));
		
	}
}
