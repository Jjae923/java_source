package ch2;

public class CompareOperEx2 {

	public static void main(String[] args) {
		int v2=1;
		double v3=1.0;
		System.out.println(v2 == v3);
		
		// 0.1을 컴퓨터가 인식을 잘 못하는데 double이 더 정밀하게 인식한다고함
		double v4=0.1d;
		float v5=0.1f;
		System.out.println(v4 == v5);
		System.out.println((float)v4 == v5);
		

	}

	
}
