package co.yedam.lesson;

/*
 * �̸�, ����
 */
public class Teacher {
	private String name;
	private String major;
	
	//Teacher t1 = new Teacher(); => ��������°� �ν��Ͻ�����.
	public Teacher(String name, String major) {
		this.name = name;
		this.major = major;
	}
	
	//get set �޼ҵ�
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
