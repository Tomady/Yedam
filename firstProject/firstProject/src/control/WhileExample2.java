package control;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		String name = "정도영";
		String age = "20";
		String phone = "010-1234-1234";
		int push_num = 0;
		boolean isOk = true;
		
		// 사용자의 입력을 받아
		// 1을 누르면 이름을 출력
		// 2를 누르면 나이 출력
		// 3을 누르면 연락처 출력
		// 4를 누르면 반복문 종료.
		
		Scanner sc = new Scanner(System.in);
		
		while(isOk) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.이름 2.나이 3.연락처 4.종료");
			push_num = sc.nextInt();
			
			switch(push_num) {
			case 1:
				System.out.println("이름: " + name);
				System.out.println();
				break;
			case 2:
				System.out.println("나이: " + age);
				System.out.println();
				break;
			case 3:
				System.out.println("연락처: " + phone);
				System.out.println();
				break;
			case 4:
				System.out.println("종료...");
				isOk = false;
				break;
			default:
				break;
			}
		}
		
		System.out.println("끝.");
	}
}
