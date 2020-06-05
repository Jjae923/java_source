package Array;

public class ArrayTest10 {
	public static void main(String[] args) {
		
		System.out.println(args[0]);	//"10"
		System.out.println(args[1]);	//"20"
//		메뉴 run → run cunfiguration → Argument → 10 20 입력
		System.out.println(args[0] + args[1]);
		
		//String을 숫자로 변경
		int num1 = Integer.parseInt(args[0]);	//Integer.parseInt() 괄호 안에 들어오는 String을 숫자로 변경
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt("10a"); 	//숫자로 변결할 수 없다
		
		System.out.println(num1 + num2);
		
	}
}
