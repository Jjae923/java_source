package arrays;

public class CompareToEx {
	public static void main(String[] args) {
		String str1 = "a";
		String str2 = "b";
		String str3 = "c";
		
		System.out.println(str1.compareTo(str2)); // -1  ascii(97-98)
		System.out.println(str1.compareTo(str3)); // -2  (97-99)
		
		
	}
}