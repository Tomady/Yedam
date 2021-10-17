package co.yedam.inheritance;

import co.yedam.inherit.Vehicle;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("");
//		vehicle.run();	//protected 접근제한자.
		vehicle.stop(); // public 접근제한자.

	}
}
