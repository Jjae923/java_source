package student;

public class StudentVO {
	private int no;
	private String name;
	private int grade;
	private String birth;
	
	public StudentVO() {
	}

	public StudentVO(int no, String name, int grade, String birth) {
		super();
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.birth = birth;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "학번 : "+no+","+"이름 : "+name+","+"학년 : "+grade;
	}
	
}
