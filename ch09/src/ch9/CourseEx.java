package ch9;

import java.util.Arrays;

public class CourseEx {
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<>("직장인", 3);
		workerCourse.add(new Worker("직장인"));

		Course<Student> studentCourse = new Course<>("학생", 3);
		studentCourse.add(new Student("학생"));
		
		Course<HighStudent> highStudentCourse = new Course<>("고등학생", 3);
		highStudentCourse.add(new HighStudent("고등학생"));

		// 수강생 등록
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);

		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
//		registerCourseStudent(workerCourse);		// <? extends Student> 조건 때문에 workerCourse 불가능

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);

	}
	public static void registerCourse(Course<?> course) { 	// => ? 는 와일드카드 개념 / ?만 있을 시 모든 타입에 개방
		// Person / Worker / Student / HighStudent 모두 가능
		System.out.println(course.getName()+"수강생 : "+Arrays.deepToString(course.getStudents()));
	}
	public static void registerCourseStudent(Course<? extends Student> course) {	// Student나 Student를 상속받은 애들만 가능하도록 제한
		// Student / HighStudent 만 가능
		System.out.println(course.getName()+"수강생 : "+Arrays.deepToString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Worker> course) {	 // super라고 오게 되면 Worker와 Worker의 조상만 가능하도록 제한
		// Person / Worker 만 가능
		System.out.println(course.getName()+"수강생 : "+Arrays.deepToString(course.getStudents()));
	}
}
