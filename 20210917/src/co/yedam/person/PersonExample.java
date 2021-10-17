package co.yedam.person;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("남차장");
		p1.setHeight(160);
		p1.setHeight(50);
		p1.setBlood("O");
		p1.setAge(20);

		Person p2 = new Person("홍길동", 170, 60, "B", 25);
		Person p3 = new Person("김운용", 180, 70, "AB", 30);

		Person[] family = { p1, p2, p3 };

		// family => 가족정보(이름, 혈액형, 나이) : 끝1.
		for (Person person : family) {
			System.out.println("이름:" + person.getName() + " 혈액형: " + person.getBlood() + " 나이: " + person.getAge());
		}
		System.out.println("끝1.");
		System.out.println();

		// 키가 165이상 가족만 출력(이름, 키, 몸무게) : 끝2.
		for (Person person : family) {
			if (person.getHeight() > 165) {
				System.out.println(
						"이름: " + person.getName() + " 키: " + person.getHeight() + " 몸무게: " + person.getWeight());
			}
		}
		System.out.println("끝2.");
		System.out.println();

		// p3 => 혈액형 AB로 변경
		// family => 혈액형이 AB 형인 가족만 출력(이름, 혈액형) : 끝3.
		for (Person person : family) {
			if (person.getBlood() == "AB") {
				System.out.println("이름: " + person.getName() + " 혈액형: " + person.getBlood());
			}
		}
		System.out.println("끝3.");
		System.out.println();

		// carName, carColor, carPrice, maxSpeed
		// carName1, carColor1, carPrice1, maxSpeed1
		// class Car { name, color, price, speed } => c1
		// c1.name, c1.color, c1.price, c1.speed
//		Car c1 = new Car();
//		c1.carModel = "소나타";
//		c1.carName = "EFSonata";
//		c1.maxSpeed = -110;
//		c1.setMaxSpeed(-100);
		
//		Car c2 = new Car();
	}
}
