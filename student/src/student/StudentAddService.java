package student;

public class StudentAddService {
	public boolean insert(int no, String name, int grade, String birth) {
		StudentDAO dao = new StudentDAO();
		int result = dao.insertStudent(no, name, grade, birth);
		
		return result > 0 ? true : false;
	}
}
