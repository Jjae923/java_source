package Class;

public class ComputerEx_30 {
	public static void main(String[] args) {
		Computer_29 computer = new Computer_29();
		
		int result = computer.sum(new int[] {15,16,17,18,19} );
							 //(int[] values) 배열로 받았기에 배열로 입력해줘야 한다
		System.out.println(result);
		
		System.out.println();
		int arr1[] = {25,35,45,55,65};
		result = computer.sum(arr1);
		System.out.println(result);
		
	}
}
