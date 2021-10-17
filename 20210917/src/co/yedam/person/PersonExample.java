package co.yedam.person;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("������");
		p1.setHeight(160);
		p1.setHeight(50);
		p1.setBlood("O");
		p1.setAge(20);

		Person p2 = new Person("ȫ�浿", 170, 60, "B", 25);
		Person p3 = new Person("����", 180, 70, "AB", 30);

		Person[] family = { p1, p2, p3 };

		// family => ��������(�̸�, ������, ����) : ��1.
		for (Person person : family) {
			System.out.println("�̸�:" + person.getName() + " ������: " + person.getBlood() + " ����: " + person.getAge());
		}
		System.out.println("��1.");
		System.out.println();

		// Ű�� 165�̻� ������ ���(�̸�, Ű, ������) : ��2.
		for (Person person : family) {
			if (person.getHeight() > 165) {
				System.out.println(
						"�̸�: " + person.getName() + " Ű: " + person.getHeight() + " ������: " + person.getWeight());
			}
		}
		System.out.println("��2.");
		System.out.println();

		// p3 => ������ AB�� ����
		// family => �������� AB ���� ������ ���(�̸�, ������) : ��3.
		for (Person person : family) {
			if (person.getBlood() == "AB") {
				System.out.println("�̸�: " + person.getName() + " ������: " + person.getBlood());
			}
		}
		System.out.println("��3.");
		System.out.println();

		// carName, carColor, carPrice, maxSpeed
		// carName1, carColor1, carPrice1, maxSpeed1
		// class Car { name, color, price, speed } => c1
		// c1.name, c1.color, c1.price, c1.speed
//		Car c1 = new Car();
//		c1.carModel = "�ҳ�Ÿ";
//		c1.carName = "EFSonata";
//		c1.maxSpeed = -110;
//		c1.setMaxSpeed(-100);
		
//		Car c2 = new Car();
	}
}
