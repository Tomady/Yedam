package co.yedam.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		vehicle.run();	// protected 접근제한자.
		vehicle.stop();	// default 접근제한자.
	}
}
