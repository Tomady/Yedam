package Person;

public class Worker extends Person {
	private String company;

	
	//持失切
	public Worker(String name, Gender gender, String phone, String company) {
		super(name, gender, phone);
		this.company = company;
	}

	//get set 五社球
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Worker [name: " + super.getName() + ", gender: " + super.getGender() + ", phone: " + super.getPhone() + ", company: " + this.company + "]";
	}
}
