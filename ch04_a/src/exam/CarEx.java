package exam;

//복사본
public class CarEx {
	public static void main(String[] args) {
		// Car_3 배열객체 생성
		Car_3 car[] = new Car_3[3];

		car[0] = new Car_3("일성", "김일반", "빨", 1);
		car[1] = new Car_3("이성", "김이반", "주", 2);
		car[2] = new Car_3("삼성", "김삼반", "노", 3);

		// 향상된 for문
//		for (Car_3 c : car) {
//			System.out.println(c.company + "\t");
//			System.out.println(c.model + "\t");
//			System.out.println(c.color + "\t");
//			System.out.println(c.speed + "\n");
//
//		}

		print(car);
	}
	
	public static void print(Car_3[] car) {
						   //print(car) 타입 맞춰서 print 살리기
		
	}
}
