package Class;

/* static
 * 1. 인스턴스(객체)를 생성하지 않아도 사용 가능	ex)p.36 Carculator3_35.pi
 * 2. 인스턴스 변수 / 인스턴스 메소드 사용불가	ex)p.37 return a - b;
 * 3. 대부분 정적 필드 선언과 동시에 초기화		ex)p.37 static long c,d;
*/

public class Math2_37 {
	//인스턴스 필드	: class 안에 바로 들어와 있고 long a; 선언된 것들을 부른다
	long a,b;	
	//인스턴스 메소드	: class 안에 바로 들어와 있고 long a(){}; 선언된 것들을 부른다
	long add() { return a + b; }
	long subtract() { return a-b; }
	long multiply() { return a*b; }
	double divide() { return a/b; }
	
	static long c,d;	//생성자를 통해서 초기화를 할 수 없다, 클래스 변수(메소드)라고 부름, 객채를 생성하지 않아도 사용 가능
	
	//초기화 블록
	static {
		c = 50;
		d = 30;
	}
	
	//정적(클래스) 메소드
	static long add(long c, long d) {
		return c + d;
	}
	static long subtract(long c, long d) {
		return c-d;
//		multiply();		//같은오류 : (static 아닌 거는 불러올 수가 없다, 생성된 시점이 다르기 때문에)
		//return a - b;	//오류 : static 안에서는 static으로만 사용 가능하다(static 아닌 거는 불러올 수가 없다, 생성된 시점이 다르기 때문에)
	}
}
