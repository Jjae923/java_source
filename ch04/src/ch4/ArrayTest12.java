package ch4;

public class ArrayTest12 {
	public static void main(String[] args) {
		// 배열 복제
		int oldArray[] = {10,20,30};
		
		int newArray[] = new int[4];
		
//		for(int i=0;i<oldArray.length;i++) {
//			newArray[i]=oldArray[i];
//		}
		
		// java에서 제공하는 배열 copy
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length); 
		// System.arraycopy(복제 배열, 복제 개시위치, 복제받을 배열, 붙는 시작 위치, 몇개 붙일건지) 
		
		
		for(int i:newArray) {
			System.out.println(i+" ");
		}
		
	}

}
