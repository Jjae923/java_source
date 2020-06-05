package ch4;

public class ReferenceEx {
	public static void main(String[] args) {
		
		// ReferenceEx ref=new ReferenceEx();  ====> change 에 static 없이 할 때
		// ref.change();
		
		
		int arr[] = {5,6,7,8,9};
		change(arr);
		System.out.println(arr[3]);
		System.out.println(arr[2]);
	}
	public static void change(int[] arr) { // main이 static이기 때문에 static없이 호출하려면 객체생성을 해야함 / int[] arr은 주소 자체를 넘겨주기 때문에 속성 변경 가능
		arr[3]=55;
		
	}
	public static void change(int a) {
		a=25;
	}

}
