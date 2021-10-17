package co.yedam.member;

public class Member {
	// user1(���̵�), ȫ�浿(�̸�), �뱸�߱��Ŵ絿(�ּ�)
	private String memberID;
	private String name;
	private String address;

	// ������: �ʵ忡 ���� �ʱ�ȭ.
	public Member() {
		memberID = "user1";
		name = "������";
		address = "�뱸�߱� ���ϵ�";
	}

	public Member(String mID) {
		memberID = mID;
	}

	public Member(String mID, String mName, String mAddress) {
		memberID = mID;
		name = mName;
		address = mAddress;
	}

	// get set �޼ҵ�
	public void setMemberID(String mID) {
		memberID = mID;
	}

	public String getMemberID() {
		return memberID;
	}

	public void setName(String mName) {
		name = mName;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String mAddress) {
		address = mAddress;
	}

	public String getAddress() {
		return address;
	}

	// �޼ҵ�
	public void showInfo() {
		System.out.println("ID: " + memberID + ", �̸�: " + name + ", �ּ�: " + address);
	}

	public void showMemberID() {
		System.out.println("ID: " + memberID);
	}

	public void showName() {
		System.out.println("�̸�: " + name);
	}

	public void showAddress() {
		System.out.println("�ּ�: " + address);
	}
}
