package co.dy.prj.service;

public interface Pencil {
	void selectPencil();
	
	default void pencilInterface() {
		System.out.println("나는 인터페이스 객체다.");
	}
}
