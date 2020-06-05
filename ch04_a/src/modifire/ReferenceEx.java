
package modifire;

public class ReferenceEx {
	public static void main(String[] args) {
		
//		ReferenceEx ref = new ReferenceEx();
//		ref.change();
		//staitc으로 안할 경우는 이런식으로 해야된다
		
		int arr[] = {5,6,7,8,9};
		change(arr);
		//메인자체가 static이기 때문에 (static 없으면 오류)
		System.out.println(arr[3]);
		
		change(arr[2]);
		System.out.println(arr[2]);
	}
	
	public static void change(int[] arr) {
		arr[3] = 55;
	}
	public static void change(int a) {
		a = 25;
	}
	
}
