package co.dy.prj.friend;

public class CompanyFriend extends Friend {

	public CompanyFriend() {}
	public CompanyFriend(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	@Override
	public void friendPrint() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + tel);
		System.out.println("�ּ� : " + address);
		System.out.println("���� : ���嵿��");		
	}
}
