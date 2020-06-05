package Array;

public class ArrayTest4 {
	public static void main(String[] args) {
//		int형 타입의 scores배열을 선언하고
//		각각의 방에 78,85,95,80,70 담기
		
		int scores[] = new int[5];
		
		scores[0] = 78;
		scores[1] = 85;
		scores[2] = 95;
		scores[3] = 80;
		scores[4] = 70;
		
		//제일 많이 쓰임
		//배열 선언, 생성, 초기화를 한꺼번에 하는 형태
		int scores1[] = {78,85,95,80,70};	//scores (X), scores1 (O) 새로 선언
		//int scores1[] = int[] scores1
		//똑같이 사용 가능
		
		//for문 적용 후 사용 가능
		for (int i = 0; i < scores1.length; i++) {
			System.out.println(scores1[i]);
		}
		
		System.out.println();
		
//		향상된 for문
		for (int i : scores1) {
			System.out.println(i);
		}
//		for(타입 변수명 : 배열명) {
//			출력문(변수명);
//		}
		
		
	}
}
