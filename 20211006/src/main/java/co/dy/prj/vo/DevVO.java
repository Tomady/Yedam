package co.dy.prj.vo;

public class DevVO {	//VO 객체, DTO 객체
	private int id;
	private String name;
	private String address;
	private int age;
	
	public DevVO() {}

	//get set메소드
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		System.out.print("ID: " + id + ", ");
		System.out.print("이름: " + name + ", ");
		System.out.print("주소: " + address + ", ");
		System.out.print("나이: " + age + "\n");
		
		return null;
	}
}
