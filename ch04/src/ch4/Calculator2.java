package ch4;

public class Calculator2 {
	int plus(int x, int y) {
		return x+y;
	}
	double avg(int x, int y) {
		double sum = plus(x,y);  // 메소드 안에 메소드 호출 가능
		return sum / 2;
	}
	void execute() {
		double result = avg(7,10);
		println("실행결과 = "+result);
//		System.out.println("실행결과 = "+result);  // 밑에꺼 안쓰구 요렇게는 안될라낭
	}
	void println(String message) {
		System.out.println(message);
	}

}
