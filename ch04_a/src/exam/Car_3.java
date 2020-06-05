package exam;
//복사본
public class Car_3 {

//		인스턴스변수(필드) : 고유 데이터를 저장하는 용도
		String company; //제조회사	→ 현대, 삼성...
		String model;	//모델		→ 그랜저, K5...
		String color;	//색상		→ 검정, 흰색...
		int speed;		//최고속도	→ 200, 300...		
//		String → null	(초기값)
//		int → 0 		(초기값)
		
		//생성자	→ 리턴타입은 없고 클래스명과 동일 → 이렇게 만듬
		//목적	→ 필드에 초기값을 넣는 용도
		Car_3(){	//인자를 받지 않는 default 생성자(기본 생성자)
			
			//해야 할 일 나열
			
		}
		
		
		Car_3(String company, String model, String color){
			
			this.company = company;
//			  내  .  필드  =   현대
			this.model = model;
			this.color = color;
		}
		Car_3(String company, String model, String color, int speed){
			this.company = company;
			this.model = model;
			this.color = color;
			this.speed = speed;
		}

}
