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
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + tel);
		System.out.println("주소 : " + address);
		System.out.println("구분 : 직장동료");		
	}
}
