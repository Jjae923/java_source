package classtest;

public class TransportEx {
	public static void main(String[] args) {

		// 객체 생성
		Passenger passenger = new Passenger("홍길동", 20000);
		Subway subway = new Subway(passenger, 0, 4, "당고개", "안산", null);
		// ※멤버변수로 객체가 들어왔을 때※  
		// 객체 생성 시 String x = " ";의 형태가 가능하기 때문에 "당고개" 가능하지만 passenger는 안됨(7번줄 없이 8번줄만 있을 경우 passenger 빨간줄)
		Bus bus = new Bus(new Passenger("성춘향", 10000), 0, 1233, "공릉동", "시청", null); // 객체생성 따로 안하고 바로 쓰면 줄은 줄지만 변수로 쓸 수는 없음
		
		// 동일한 메소드를 가지고 오버라이딩할 경우 왼쪽이 부모가 오는 형태가 안정적
		Transport transport = new Taxi(passenger, 10000, 4381, "잠실", "노원"); // 부모가 가지고 있는 메소드만 접근 가능 
		
	}

}
