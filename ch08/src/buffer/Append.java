package buffer;

public class Append {
	public static void main(String[] args) {
//		StringBuffer buffer1 = "";  // 직접 할당은 String만 가능
		StringBuffer buffer1 = new StringBuffer("Hello");
		buffer1.append("world")
			   .append(true)
			   .append(10.5);
		
		System.out.println(buffer1);
	}
}
