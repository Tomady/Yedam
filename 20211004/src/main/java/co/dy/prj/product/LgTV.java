package co.dy.prj.product;

import co.dy.prj.service.RemoteController;

public class LgTV implements RemoteController{

	@Override
	public void powerOn() {
		System.out.println("LGTV 전원을 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("LGTV 전원을 끈다.");		
	}
	
}
