package ch8;

public class FindKim {
	public static void main(String[] args) {
		String names[] = {"Queen", "Tod", "Kim", "Park", "Choi"};
		System.out.println(findKim1(names));
		System.out.println(findKim2(names));
	}
	// 넘겨받은 배열에서 Kim이라는 문자열의 위치를 찾아
	// Kim은 3번째 위치에 있다 라는 문자열을 리턴하는
	// 메소드 작성하기
	public static String findKim1(String names[]) {
		// 내가 푼거
		for(int i=0;i<names.length;i++) {
			String x = "Kim";
			if(names[i]==x) {
				return x+"는 "+(i+1)+"번째 위치에 있다";	
			}
		}
		return null;
	}
	// 풀이
	public static String findKim2(String names[]) {
		int pos=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].equals("Kim")) {
				pos = i;
				break;
			}
		}
		return "Kim은 "+(pos+1)+"번째 위치에 있다";
	}
}
