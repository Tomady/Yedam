package firstProject;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name;
		String hobby;
		int age = 0;
		
		System.out.println("이름을 입력하세요...");
		name = scn.nextLine();	// 1ch Enter.
		System.out.println("나이를 입력하세요...");
		age = scn.nextInt();	// 20 Enter.
//		scn.nextLine();	//nextInt enter값 주의
		System.out.println("취미를 입력하세요...");
		hobby = scn.nextLine();
		System.out.println("[입력한 값]");
		System.out.printf("이름: %s, 나이: %d, 취미: %s", name, age, hobby);
	}

}
