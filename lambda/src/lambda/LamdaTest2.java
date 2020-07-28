package lambda;

public class LamdaTest2 {

	public static void main(String[] args) {
		// 일반적인 익명구현 객체 생성
		Lambda1 lambda = new Lambda1() {	
			@Override
			public void method() {
				System.out.println("안녕하세요");
			}
		};
		// 일반적인 익명구현 객체 실행 
		lambda.method();
		
		// 람다식
		Lambda1 lambda2 = () -> System.out.println("안녕하세요");
		// 익명구현 객체 실행 방식 동일
		lambda2.method();
		
		lambda2 = () -> {
			int i = 10;
			System.out.println(i*i);
		};
		lambda2.method();
		
	}
}
