package Array;

public class ArrayTest3 {
	public static void main(String[] args) {
		
		int arr1[] = new int[5];	//각방에 0이 들어가 있다
						//arr1.length
		//초기화
		arr1[0] = 5;	//0번방에 5담는다
		arr1[1] = 6;
		arr1[2] = 7;
		arr1[3] = 8;
		arr1[4] = 9;
		
		//배열 사용 - 해당 번호방 출력
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		
		//배열은 무조건 for문과 연결 된다 - 대표적인 배열for문
		for (int i = 0; i < 5; i++) {
			System.out.println(arr1[i]);	//방번호 대신 i 대체
		}
		
		for (int i = 0; i < arr1.length; i++) {	//arr1.length 가져와서 쓸 수 있다
			System.out.println(arr1[i]);
		}
		
	}
}
