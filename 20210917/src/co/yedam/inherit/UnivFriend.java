package co.yedam.inherit;

public class UnivFriend extends Friend {
	private String major;

	public UnivFriend(String name, String phone, String major) {
		super(name, phone);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "UnivFriend [name: " + this.getName() //
				+ ", phone: " + this.getPhone() //
				+ ", major: " + major + "]";
	}
}
