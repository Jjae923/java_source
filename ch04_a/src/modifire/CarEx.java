package modifire;
//복사본
public class CarEx {
	public static void main(String[] args) {
		Car_2 car1 = new Car_2(100);					//public
		Car_2 car2 = new Car_2(100, "스포티지");			//protected
		Car_2 car3 = new Car_2(100, "그랜저", "중형");	//package
		
		System.out.println(car1 == car2);
	}
}
