package co.yedam.member;

public class MemberExample {
	public static void main(String[] args) {
	
		Member m1 = new Member("user1", "박미림", "대구중구 남일동");	//생성자 호출
		m1.showInfo();
		
//		m1.memberID = "user1";
		m1.setMemberID("user1");
//		m1.name = "Hong";
		m1.setName("Hong");
//		m1.address = "중구 남일동";
		m1.setAddress("중구 남일동");
//		System.out.println("ID: " + m1.memberID);
		System.out.println("ID: " + m1.getMemberID());
//		System.out.println("이름: " + m1.name);
		System.out.println("이름: " + m1.getName());
//		System.out.println("주소: " + m1.address);
		System.out.println("주소: " + m1.getAddress());
		
		Member m2 = new Member("User2");
		m2.setMemberID("user2");
		m2.setName("정도영");
		m2.setAddress("대구 동구 신암동");
		m2.showInfo();
		
		Member m3 = new Member("user3", "홍길동", "대구서구 신당동");
		m3.showInfo();
		m3.setMemberID("박길동");
		m3.showInfo();
		
	}
}
