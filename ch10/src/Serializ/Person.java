package Serializ;

import java.io.Serializable;

// 직렬화 : Serializable
// 개체가 가진 데이터들을 순차적인 데이터로 변환하는 것
public class Person implements Serializable{
	/**
	 * 역직렬화시 직렬화된 같은 클래스인지 구별하기 위해 사용
	 */
	private static final long serialVersionUID = 8341859498922404580L;
	
	private String name;
	private String job;
	transient String addr;	// transient : 직렬화시키는 필드에서 빼줘
	
	public Person(String name, String job, String addr) {
		super();
		this.name = name;
		this.job = job;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + ", addr=" + addr + "]";
	}
}
