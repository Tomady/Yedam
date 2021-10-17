package firstProject;

public class StringExample {
	public static void main(String[] args) {
		int age = 20;
		int age1 = 25;
		
		String name = "홍길동";
		String name1 = "정도영";
		
		long myAge = age;	//자동형변환(promotion)
		age = (int)myAge;	//강제형변환(casting)
		
//		age = "홍길동";
//		name = 20;
		
		System.out.println(name + "의 나이는 " + age);
		System.out.println(name1 + "의 나이는 " + age1 + "입니다.");
	}
}
