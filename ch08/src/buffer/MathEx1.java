package buffer;

public class MathEx1 {
	public static void main(String[] args) {
		// 모든 메소드가 static이므로 Math.으로 끌어오면 된다
		double var1 = 90.7552;
		
		System.out.println(Math.round(var1)); // 반올림
		System.out.println(Math.ceil(var1));  // 올림
		System.out.println(Math.floor(var1)); // 버림
	}
}
