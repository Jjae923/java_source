package collection;

/* set구조로 일반적인 데이터가 아닌 내가 정의한 생성자로 데이터를 담을 때엔
 * 중복 데이터 걸러내려면 오버라이딩으로 조건 넣기 필수
 */
public class StudentVO {
	private int num;
	private String name;
	public StudentVO(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return num+":"+name;
	}

	@Override
	public int hashCode() {
//		return this.num;
		// String이 정의한 hashCode()값
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StudentVO) {
			StudentVO vo = (StudentVO)obj;
//			return this.num == vo.num;
			return this.name.equals(vo.name);
		}
		return false;
	}
}
