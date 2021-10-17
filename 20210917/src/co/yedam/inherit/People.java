package co.yedam.inherit;

/*
 * 상속: 부모 -> 자식.
 */
public class People {
	private String name;
	private String ssn;

	public People() {
	}

	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public void showInfo() {
		System.out.println("이름: " + name + " 주민번호: " + ssn);
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", ssn=" + ssn + "]";
	}

}
