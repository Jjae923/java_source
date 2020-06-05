package exam;

public class StudentEx {
	public static void main(String[] args) {
		// Student 객체 3개 생성
//		Student_1 student1 = new Student_1();
//		Student_1 student2 = new Student_1();
//		Student_1 student3 = new Student_1();
		Student_1 student[] = new Student_1[3]; // Arr arr[] = new Arr[3];
//		System.out.println(student[0]);				//arr[0] = 	15;
		// null : 값이 부여된게 없기 때문
		student[0] = new Student_1();
		student[1] = new Student_1();
		student[2] = new Student_1();
		System.out.println(student[0]);

		// 첫번째 Student 객체 초기화
		student[0].addr = "서울";
		student[0].name = "홍길동";
		student[0].no = 1;
		// 첫번째 Student 객체 초기화 후 확인
		System.out.println(student[0].no);
		System.out.println(student[0].name);
		System.out.println(student[0].addr);

		System.out.println("==================");
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].no);
			System.out.println(student[i].name);
			System.out.println(student[i].addr);
		}
		System.out.println("==================");

		// 두번째 Student 객체 초기화
		student[1].addr = "부산";
		student[1].name = "김정수";
		student[1].no = 2;
		// 첫번째 Student 객체 초기화 후 확인
		System.out.println(student[1].no);
		System.out.println(student[1].name);
		System.out.println(student[1].addr);

		// 세번째 Student 객체 초기화
		student[2].addr = "싱가폴";
		student[2].name = "윤종은";
		student[2].no = 3;
		// 세번째 Student 객체 초기화
		System.out.println(student[2].no);
		System.out.println(student[2].name);
		System.out.println(student[2].addr);

		/*
		 * 변수들을 동일한 이름으로 접근할 수 있다 각각의 요소에 접근하려면 인덱스들에 접근하면 된다 int를 담으면 int를 남는거고,
		 * Student를 담으면 Student를 담을 수 있다
		 */
		print(student);
	}
	
	static void print(Student_1[] student) {
		
	}
}
