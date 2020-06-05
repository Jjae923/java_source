package classtest;

public class MethodEx1 {
	public static void main(String[] args) {
		
		Method1 method = new Method1();
		
//		System.out.println(method.method1()); // 이건 리턴을 원하는거라서 불가능
		method.method1(); // 호출만 가능
		
		
		// 메소드 호출
		int arr[] = {5,6,7,8,9};
		System.out.println(method.method5(arr));

		
		String str[] = {"a", "b", "c", "d", "e"};
		System.out.println(method.method6(str));
		
		Box box = new Box(10, 5, 8);
		method.method7(box);
		
//		System.out.println(method.method8(box)); ---> stack에 있는 주소값이 나오기때문에 출력 불가능
		Box box1 = method.method8(box);
		System.out.println(box1.getVolume());
		
	}

}
