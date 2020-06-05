package Class;

public class Calculator2_25 {
//	다른 메소드에서 메소드를 부를 수 있다
//	메소드 안에 메소드
//	내꺼면 그냥 불러서 쓰면 된다
	int plus(int x, int y)	{
		return x + y;	//return : 나를 호출한 곳으로
	}
	double avg(int x, int y) {
		double sum = plus(x,y);
		return sum /2;
	}
	void execute() {
		double result = avg(7, 10);
			println("실행결과 = " + result);
	}
	void println(String message) {
		System.out.println(message);
	}
}
