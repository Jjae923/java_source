package student;

import java.util.List;

public interface Service {
	public int insert(StudentVO vo);
	public StudentVO getUser(int no);
	public List<StudentVO> List();
}
