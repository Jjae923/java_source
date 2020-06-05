package afterschool;

public class ForTest {
	public static void main(String[] args) {
		// 1~20까지의 숫자 중에서 
		
		// 1 2 4 8 16 출력
		
		for(int i=1;i<=20;i*=2) {  // i=i*2
			System.out.println(i);
		}
		
		
		// 250 200 150 100 50
		
		for(int i=250;i>0;i-=50) {  // i=i-50
			System.out.println(i);
		}
		
		// 2 4 10 28 82 244
		//  2 6 18 54 162    2에서 시작해서 i*3 씩 더하기
		for(int i=2;i<250;i=i*3-2) {
			System.out.println(i);
		}
	
	}

}
