package Class;

public class Calculator_24 {
	//오버로딩 : 하나의 클래스에 동일한 이름으로 존재
	
	//생성자 오버로딩
	//메소드 오버로딩
	
	//정사각형 넓이
	double areaRectangle(double width) {
	//메소드 오버로딩
		return width * width;
	}
	
	//직사각형 넓이
	double areaRectangle(double width, double height) {
		// 오버로딩
		return width * height;
	}
}
