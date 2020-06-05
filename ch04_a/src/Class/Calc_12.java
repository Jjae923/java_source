package Class;

//두 수를 받아 사칙연산 하는 프로그램
public class Calc_12 {
	int num1;	//첫번째 수
	int num2;	//두번 째 수
	
	//기본 생성자
	Calc_12() {}
	//인자를 모두 받는 생성자
	Calc_12(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//void : 리턴 없음
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	//덧셈기능을 구현하는 메소드
	int add(int num1, int num2) {
	//void를 int로 바꿔줌
		int result = num1 + num2;
		return result;
		//int result 값이기에 첫째줄 타입을 void → int로 변경
	}
	
	//뺄셈기능을 구현하는 메소드
	int subtract(int num1, int num2) {
		return num1 - num2;				//두줄을 한줄로 쓰는 방법
	}
	
	//나누기 기능을 구현하는 메소드 :  num1 / num2  = 결과를 double로 리턴
	
	//리턴값 타입 메소드명() {}
	double divide(int num1, int num2) {	//double타입으로 divide이름을 정하고 두 수를 입력 받는다
		return (double)num1/num2;		//num1/num2를 나눠서 보낸다
		//3.0 =  10/3
		//→ 메소드만 		double = 3.0
		//→ return 값도	double = 3.3333......
	}
	
}
