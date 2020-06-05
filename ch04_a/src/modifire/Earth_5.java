package modifire;

public class Earth_5 {
//	static
//	공통으로 사용 할껀데 변하지 않고 사용 가능하다
	
	//static, final 순서가 바뀌어도 상관없음
	final static double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;		//밑에 static에서 초기화
	//상수 선언 할 때는 대문자로 !
	//변수 선언에서 대문자로 했을 때는 상수 선언을 하는 것이 관례
	
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
	
}
