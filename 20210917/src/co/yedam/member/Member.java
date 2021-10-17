package co.yedam.member;

public class Member {
	// user1(아이디), 홍길동(이름), 대구중구신당동(주소)
	private String memberID;
	private String name;
	private String address;

	// 생성자: 필드에 값을 초기화.
	public Member() {
		memberID = "user1";
		name = "박지원";
		address = "대구중구 내일동";
	}

	public Member(String mID) {
		memberID = mID;
	}

	public Member(String mID, String mName, String mAddress) {
		memberID = mID;
		name = mName;
		address = mAddress;
	}

	// get set 메소드
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

	// 메소드
	public void showInfo() {
		System.out.println("ID: " + memberID + ", 이름: " + name + ", 주소: " + address);
	}

	public void showMemberID() {
		System.out.println("ID: " + memberID);
	}

	public void showName() {
		System.out.println("이름: " + name);
	}

	public void showAddress() {
		System.out.println("주소: " + address);
	}
}
