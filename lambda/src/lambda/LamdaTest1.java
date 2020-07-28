package lambda;

public class LamdaTest1 {
	int max(int a, int b) {
		return a > b ? a : b;
	}
	
	/* 방법 ① 기본
 	   (int a, int b) -> {
			  return a > b ? a : b;
	   }
	   
	 * 방법 ② 실행할 문장이 하나라면 중괄호 생략 가능
	   (int a, int b) -> return a > b ? a : b;
	   
	   
	 * 방법 ③ 유추할 수 있는 타입은 생략
	   (a, b) -> return a > b ? a : b;
	   
	 */
	
	void printVar(String name, int i) {
		System.out.println(name + "=" + i);
	}
	
	/* 방법 ① 기본
	   (String name, int i) -> {
			  System.out.println(name + "=" + i);
	   }
	   
	 * 방법 ② 실행할 문장이 하나라면 중괄호 생략 가능
	   (String name, int i) -> System.out.println(name + "=" + i);
	   
	 * 방법 ③ 유추할 수 있는 타입은 생략
	   (name, i) -> System.out.println(name + "=" + i);
	   
	 */
	
	int square(int x) {
		return x * x;
	}
	
	/* 방법 ① 기본
	   (int x) -> {
			return x * x;
	   }
	
	 * 방법 ② 실행할 문장이 하나라면 중괄호 생략 가능
	   (int x) -> return x * x;
	 
	 * 방법 ③ 유추할 수 있는 타입은 생략
	   (x) -> return x * x;
	 
	 */
	
	
	int roll() {
		return (int)(Math.random()*6);
	}
	
	/* 방법 ① 기본
	   () -> {
			return (int)(Math.random()*6);
	   }
	
	 * 방법 ② 실행할 문장이 하나라면 중괄호 생략 가능
	   () -> return (int)(Math.random()*6);
	 
	 * 방법 ③ 유추할 수 있는 타입은 생략
	   () -> (int)(Math.random()*6);
	 
	 */
	
	int sumArr(int[] arr) {
		int sum = 0;
		for(int i:arr)
			sum+=i;
		return sum;
	}

	/* 방법 ① 기본
	   (int[] arr) -> {
			int sum = 0;
			for(int i:arr)
				sum+=i;
			return sum;
	   }
	 
	 */
}
