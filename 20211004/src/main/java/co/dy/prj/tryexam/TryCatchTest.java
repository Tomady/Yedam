package co.dy.prj.tryexam;

import java.io.FileNotFoundException;

public class TryCatchTest {
	public void method1() throws Exception {
//		try {
//			Class clazz = Class.forName("co.dy.prj.TestInterface");
//			Class clazz = Class.forName("co.dy.prj.TV");
//			System.out.println("원하는 클래스가 존재합니다.");
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("예기치 않은 오류가 발생되었습니다.");
//			System.out.println("관리자에게 문의 하세요.");
//		}
		
		Class clazz = Class.forName("co.dy.prj.TestInterface");
//		Class clazz = Class.forName("co.dy.prj.TV");
		System.out.println("원하는 클래스가 존재합니다.");
	}
}
