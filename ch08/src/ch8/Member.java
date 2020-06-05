package ch8;

public class Member {

	private String id;

	public Member(String id) {
		super();
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Member) {  // classcastexception 나오는 경우를 없애주는 instanceof
			Member m = (Member) obj;
			return this.id == m.id;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return id;
	}
	
}
