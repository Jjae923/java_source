package lambda;

class Outer{
	int val = 10;
	class Inner{
		int val = 20;
		void method(int i) {
			
			
//			i = 20 ; // 람다식에서 사용된다면 final 개념으로 사용되어야 함
			
			int val = 30; // 위와 같은 개념
			
			Lambda5 lamb = () -> {
				System.out.println("             i : "+i);
				System.out.println("           val : "+i);
				// 람다식 내부의 this는 Inner 객체를 의미
				System.out.println("      this.val : "+(++this.val));
				// 바깥 객체의 참조를 얻기 위해 클래스명.this
				System.out.println("Outer.this.val : "+(++Outer.this.val));
			};
		}
	}
}

public class LamdaTest6 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
	}
}
