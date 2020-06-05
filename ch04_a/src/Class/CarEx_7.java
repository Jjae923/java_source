package Class;

public class CarEx_7 {
	public static void main(String[] args) {
		//Car 객체 생성 → 생성자 호출
		Car_6 car1 = new Car_6();
		//담는 부분   객체 생성 부분
		Car_6 car2 = new Car_6("현대", "그랜저", "검정");
		Car_6 car3 = new Car_6("대우", "마티즈", "흰색", 120);
		
		//Car 객체 사용
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.speed);
		System.out.println();
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.speed);
		
		
	}
}
