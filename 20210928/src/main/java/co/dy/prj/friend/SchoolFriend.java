package co.dy.prj.friend;

public class SchoolFriend extends Friend {

	public SchoolFriend(){}
	public SchoolFriend(String name, String tel, String address){
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	@Override
	public void friendPrint() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + tel);
		System.out.println("�ּ� : " + address);
		System.out.println("���� : �б�ģ��");
	}

}
