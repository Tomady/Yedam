package co.dy.prj.member.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {
	private String id;
	private String name;
	private String password;
	private String tel;
	private String address;
	private String author;
	
	public void toListString() {
		System.out.print(id + " : ");
		System.out.print(name + " : ");
		System.out.print(password + " : ");
		System.out.print(tel + " : ");
		System.out.print(address + " : ");
		System.out.println(author);
	}
	
	public String toString() {
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
		System.out.println("패스워드: " + password);
		System.out.println("전화번호: " + tel);
		System.out.println("주소: " + address);
		System.out.println("권한: " + author);
		
		return null;
	}
}
