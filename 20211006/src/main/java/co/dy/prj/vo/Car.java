package co.dy.prj.vo;

public class Car implements Command {

	@Override
	public void run() {
		System.out.println("자동차는 달린다.");
	}

}
