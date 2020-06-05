package Class;

//두 수를 받아 사칙연산 하는 프로그램
public class CalcEx_13 {
	public static void main(String[] args) {
		Calc_12 calc = new Calc_12();
		
		//add 메소드 호출
		int result = calc.add(5, 7);
		//값을 받는다
		System.out.println(result);
		
		//덧셈
		result = calc.add(12, 6);
		System.out.println(result);
		
		result = calc.add(18, 19);
		System.out.println(result);
		
		System.out.println(calc.add(24, 35));
						 //호출.→ return→ add 값 받아옴
		
		//뺄셈
		System.out.println(calc.subtract(5, 3));
		System.out.println(calc.subtract(12, 24));
		System.out.println(calc.subtract(15, 6));
		
		//리턴없는 메소드 호출
		calc.powerOn();	//타입 제외 하고 호출 밖에 못한다 (돌려주고 오기만 하면 된다)
//		System.out.println(calc.powerOn());
						 // [void ] 리턴되어 오는 값을 출력하는 문구이기 때문에 출력 불가능
		
		//divide 메소드 호출
		System.out.println(calc.divide(10, 3));
		
	}
}
