package ch9;

public class BoxEx1 {
	public static void main(String[] args) {
		Box1 box1 = new Box1();	
		
		box1.setItem("홍길동");	// box1.setItem(new String("홍길동"))  // String
		System.out.println(box1.getItem()); // (String)box1.getItem();
		box1.setItem(15);		// box1.setItem(new Integer(15))	  // int
		System.out.println(box1.getItem());
		box1.setItem(3.14);		// box1.setItem(new Double(3.14))     // double
		System.out.println(box1.getItem());
		box1.setItem(true);		// box1.setItem(new Boolean(true))	  // boolean
		System.out.println(box1.getItem());
		box1.setItem(3.16f);	// box1.setItem(new Float(3.16f))	  // float
		System.out.println(box1.getItem());
		
		// 모든 타입에 대해서 열어놓는 변수는 형변환을 계속 해야하기 때문에 시스템적으로 효율적X
	}
}
