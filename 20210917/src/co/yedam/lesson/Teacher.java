package co.yedam.lesson;

/*
 * 이름, 과목
 */
public class Teacher {
	private String name;
	private String major;
	
	//Teacher t1 = new Teacher(); => 공간만드는걸 인스턴스생성.
	public Teacher(String name, String major) {
		this.name = name;
		this.major = major;
	}
	
	//get set 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
