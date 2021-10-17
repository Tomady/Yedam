package friend;

/*
 * 친구 목록 관리.
 * 이름, 연락처, email, 키, 몸무게.
 * 1.등록, 2.조회(이름), 3.목록, 4.수정, 5.삭제, 9.종료.
 */

public class Friend {
	private String name;
	private String phone;
	private String e_mail;
	private double height;
	private double weight;
	
	public Friend() {}
	public Friend(String name, String phone, String e_mail, double height, double weight) {
		super();
		this.name = name;
		this.phone = phone;
		this.e_mail = e_mail;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.printf("[이름: %s, 연락처: %s, Email: %s, 키: %.2f, 몸무게: %.2f]\n", name, phone, e_mail, height, weight);
	}
}
