package co.dy.prj.product;

import co.dy.prj.service.RemoteController;

public class SamsungTV implements RemoteController {

	@Override
	public void powerOn() {
		System.out.println("삼성TV 전원을 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("삼성TV 전원을 끈다.");

	}

}
