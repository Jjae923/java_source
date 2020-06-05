package ch4;

// 삼각형 넓이 구하는 클래스
public class Triangle {
	
	// 필드
	int baseline;  // 밑변 : baseline
	int height;    // 높이 : height
	
	
	Triangle(){}
	Triangle(int baseline,int height){
		this.baseline = baseline;  // 생성자 초기화
		this.height = height;
	}
	

	// 기능 - 메소드 getArea()
	// 면적구하기 : 리턴타입 double,
	// 구현기능 : 클래스의 필드를 이용하여 면적구하기
	
	double getArea(int baseline,int height) {
		return (double) (baseline*height) / 2;
	}
	
	

}
