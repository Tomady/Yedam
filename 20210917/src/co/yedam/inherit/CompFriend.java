package co.yedam.inherit;

public class CompFriend extends Friend {
	private String depart;

	public CompFriend(String name, String phone, String depart) {
		super(name, phone);
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "CompFriend [name: " + this.getName() //
				+ ", phone: " + this.getPhone() //
				+ ", depart: " + depart + "]";
	}

}
