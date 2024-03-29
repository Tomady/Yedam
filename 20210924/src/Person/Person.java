package Person;

public class Person {
	private String name;
	private Gender gender;
	private String phone;
	
	//持失切
	public Person(String name, Gender gender, String phone) {
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	
	//get set 五社球
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name: " + name + ", gender: " + gender + ", phone: " + phone + "]";
	}
}
