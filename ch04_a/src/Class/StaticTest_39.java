package Class;

public class StaticTest_39 {
	public static void main(String[] args) {
//		print();	//인스턴스 메소드는 못 부른다
//					1. print 메소드를 static 만들기
//					2. 객체를 생성한 후 접근
		
		//2. 객체를 생성한 후 접근
		StaticTest_39 test = new StaticTest_39();	
		test.print();
		}

		//1. 방법 static 붙이기
		/* static */ void print() {	
		
		}
}
