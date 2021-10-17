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
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + tel);
		System.out.println("주소 : " + address);
		System.out.println("구분 : 학교친구");
	}

}
