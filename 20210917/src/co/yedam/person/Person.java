package co.yedam.person;

/*
 * 이름, 키, 몸무게, 혈액형, 나이
 */
public class Person {
	private String name;
	private double height;
	private double weight;
	private String blood;
	private int age;
	
	//생성자
	public Person() {}
	public Person(String name, double height, double weight, String blood, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.blood = blood;
		this.age = age;
	}
	
	//get set 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드
}
