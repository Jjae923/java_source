package ch4;

public class Car {
	
	// 인스턴스 변수(필드) : 고유 데이터를 저장하는 용도
	String company; // 제조회사 => 현대, 삼성 ...
	String model;   // 모델 => 그랜저, SM5 ...
	String color;   // 색상 => 검정, 흰색 ...
	int speed;      // 최고속도 => 200, 300  ...
	
	// 생성자 => 클래스 이름과 동일해야하고 여러개가 올 수 있지만 () 안의 내용이 같으면 오류남!(타입 갯수 똑같으면 안됨)
	// 리턴타입은 없고 클래스명고 동일해야함
	// 목적 : 필드에 초기값을 넣는 용도
	Car(){// 기본(default) 생성자 = ()안에 아무것도 없는 생성자
		
		// 해야할 일 나열
	} 
	Car(String company,String model,String color){
		// "현대","그랜저","검정"
		this.company = company;  // this.내가 가지고 있는 필드
		this.model = model;
		this.color = color;
	}
	Car(String company,String model,String color,int speed){
		this.company = company;
		this.model = model;
		this.color = color;
		this.speed = speed;
		
	}
	
	
}
