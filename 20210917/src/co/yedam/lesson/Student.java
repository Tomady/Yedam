package co.yedam.lesson;

/*
 * 학생이름, 연락처, 학생주소
 */
public class Student {
	private String studentName;
	private String phone;
	private String address;
	
	public Student(String name, String phone, String address) {
		this.studentName = name;
		this.phone = phone;
		this.address = address;
	}
	
	public String gg(String studentName) {
		this.studentName = studentName;
		
		return studentName;
	}
	
	//get set 메소드.
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
