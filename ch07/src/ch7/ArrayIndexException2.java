package ch7;

public class ArrayIndexException2 {
	public static void main(String[] args) {
		// UnCheckedException
		// java.lang.ArrayIndexOutOfBoundsException   ---> 배열 사용 시 자주 발생

		if(args.length==2) {
			System.out.println(args[0]);
			System.out.println(args[1]);
		}else {
			System.out.println("인자 값을 확인해주세요.");
		}
	}
}
