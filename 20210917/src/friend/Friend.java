package friend;

/*
 * ģ�� ��� ����.
 * �̸�, ����ó, email, Ű, ������.
 * 1.���, 2.��ȸ(�̸�), 3.���, 4.����, 5.����, 9.����.
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
		System.out.printf("[�̸�: %s, ����ó: %s, Email: %s, Ű: %.2f, ������: %.2f]\n", name, phone, e_mail, height, weight);
	}
}
