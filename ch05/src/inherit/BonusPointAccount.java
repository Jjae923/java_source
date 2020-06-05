package inherit;

public class BonusPointAccount extends Account {

	private int bonusPoint;
	
	public BonusPointAccount(String ano, String owner, int balance, int bonusPoint) {
		super(ano, owner, balance);
		this.bonusPoint=bonusPoint;
	}

	// 예금한다 : 예금 + 예금액의 1%를 보너스포인트 지급
	// 부모의 메소드를 재정의 => 오버라이딩

	@Override  // => 재정의했다는 표시
	void deposit(int amount) {
		super.deposit(amount);				// 예금한다
		bonusPoint+=(int)(amount*0.01);		// 예금액의 1%를 보너스 포인트 지급
	}
	
	
	
	

}
