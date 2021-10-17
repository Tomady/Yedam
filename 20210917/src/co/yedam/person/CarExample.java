package co.yedam.person;

public class CarExample {
	public static void main(String[] args) {
		// 변수이름: sonata
		Car sonata = new Car("소나타", "SonataHybrid", 2000, 200, new Tire());
		sonata.getCarName();
		sonata.getCarModel();
		
	}
}
