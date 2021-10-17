package co.dy.prj;

import co.dy.prj.service.RemoteController;

public class TestInterface {
	private RemoteController rc;
	
	public TestInterface(RemoteController rc) {
		this.rc = rc;
	}
	
	public String toString() {
		rc.powerOn();
		rc.powerOff();
		
		return null;
	}
	
	public RemoteController reReturn() {
		return rc;
	}
}
