package classtest;

public class Method1 {
	// 매개변수는 없고 리턴하는 것도 없는 메소드
	public void method1() {	}
		
	// 정수 매개변수를 하나 받아들인 후 리턴하지 않는 메소드
	public void method2(int x) { }
	
	// 매개변수는 없고 정수를 리턴하는 메소드
	public int method3() {
		return 5;
	}
	
	// 정수 매개변수를 두 개 받아들인 후 정수타입을 리턴하는 메소드
	public int method4(int x, int y) {
		return x+y;
	}
	
	// 정수형 배열 매개변수를 받아들인 후 정수타입을 리턴하는 메소드
	public int method5(int arr[]) {   // 배열타입 배열명[] = 배열타입[] 배열명 으로 표기가능
		int sum=0;
		for(int i:arr) { // 배열 arr이 i에 하나씩 들어갈거야
			sum+=i;		 // sum+=i  ==> sum=sum+i
		}
		return sum;
	}
	
	// 문자열 배열 매개변수 하나를 넘겨받아 문자열을 리턴하는 메소드
	String method6(String[] str) {
		// 배열 안의 문자열 요소를 모두 연결해서 리턴
		String concat = "";  // String 초기화는 " " or null 두가지 중 하나
		
		// for문
		for(int i=0;i<str.length;i++) {
			concat+=str[i];
		}
		// 향상된 for문
		for(String s:str) {  // 배열 str이 s에 하나씩 들어갈거야
			concat+=s;
		}
		return concat;
	}
	
	// BOX 매개변수를 하나 인자로 받고 리턴타입은 없는 메소드
	void method7(Box box) {
		// box가 가지고 있는 메소드 getVolume을 호출하여 결과를 확인
		System.out.println(box.getVolume());
	}

	// BOX 매개변수를 하나 인자로 받고 리턴타입은 BOX로 하는 메소드
	Box method8(Box box) {
//		Box box1 = new Box(8,9,10);
//		return box1; 과 같은 의미
		return new Box(8,9,10); 
		// 리턴타입이 대문자면 null 리턴하면 됨...?
	}
	
	
	
	
}
