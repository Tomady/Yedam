package co.dy.prj.product;

import co.dy.prj.service.Pencil;
import co.dy.prj.service.RemoteController;

public class MyPrint implements RemoteController {
	private Pencil pencil;
	
	public MyPrint(Pencil pen) {
		this.pencil = pen;
	}
	
//	@Override
//	public void selectPencil() {
//		System.out.println("4B");
//	}

	@Override
	public void powerOn() {
		System.out.println("프린트 전원을 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("프린트 전원을 끈다.");
	}

	public void toPrint() {
		System.out.print("나는 ");
		pencil.selectPencil();
	}
}
