package co.dy.prj;

public abstract class Animal {	//추상클래스 Animal animal = new Animal(); X
	public abstract void run();
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
}
