package co.yedam.member;

public class MemberExample {
	public static void main(String[] args) {
	
		Member m1 = new Member("user1", "�ڹ̸�", "�뱸�߱� ���ϵ�");	//������ ȣ��
		m1.showInfo();
		
//		m1.memberID = "user1";
		m1.setMemberID("user1");
//		m1.name = "Hong";
		m1.setName("Hong");
//		m1.address = "�߱� ���ϵ�";
		m1.setAddress("�߱� ���ϵ�");
//		System.out.println("ID: " + m1.memberID);
		System.out.println("ID: " + m1.getMemberID());
//		System.out.println("�̸�: " + m1.name);
		System.out.println("�̸�: " + m1.getName());
//		System.out.println("�ּ�: " + m1.address);
		System.out.println("�ּ�: " + m1.getAddress());
		
		Member m2 = new Member("User2");
		m2.setMemberID("user2");
		m2.setName("������");
		m2.setAddress("�뱸 ���� �žϵ�");
		m2.showInfo();
		
		Member m3 = new Member("user3", "ȫ�浿", "�뱸���� �Ŵ絿");
		m3.showInfo();
		m3.setMemberID("�ڱ浿");
		m3.showInfo();
		
	}
}
