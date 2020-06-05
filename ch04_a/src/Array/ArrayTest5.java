package Array;

public class ArrayTest5 {
	public static void main(String[] args) {
		int score[] = new int[5];
		
		//0,10,20,30,40
		for (int i = 0; i < score.length; i++) {
			score[i] = i*10;
		}
		
		//값이 들어있는지 확인
		for (int i : score) {
			System.out.println(i);
		}
				
		//무식한 합계
		int sum1 = score[0] + score[1] + score[2];
				  //반복의 형태
		
		//덜 줄인 합계
		for (int i = 0; i < score.length; i++) {
			System.out.println(i);
		}
		
		//향상된 합계
		int sum = 0;
		for (int i : score) {	//score배열에 들어있는 차례대로 가지고 나오고 i라는 변수에 담아준다
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("합계 : ");
		
	}
}
