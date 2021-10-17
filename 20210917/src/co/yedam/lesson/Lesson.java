package co.yedam.lesson;

public class Lesson {
	private Teacher teacher;
	private String group; // 3-1반
	private Student[] students;

	//접근제한자

	public Lesson() {
		students = new Student[3];
	}

	// get set 메소드
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}

	public void showStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println("이름: " + students[i].getStudentName() 
						+ " 연락처: " + students[i].getPhone() 
						+ " 주소: " + students[i].getAddress());
			}
		}
	}
}
