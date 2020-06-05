package ch4;

public class TriangleEx {
	public static void main(String[] args) {
		
		Triangle triangle = new Triangle();
		
		
		double result = triangle.getArea(10, 8);
		System.out.println(result);
		
		
		System.out.println(triangle.getArea(30, 5));
		

	}

}
