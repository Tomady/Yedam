package reference;

import java.util.Scanner;

public class MainExecute {
	public static void main(String[] args) {
		// 1.학생수 지정. 2.학생이름 입력 3.출력 4.종료
		String[] student = null;
		int num = 0;

		while(true) {
			showMenu();

			num = Integer.parseInt(get_str());
			
			if (num == 1) {	//1.학생수 지정
				student = createSutdent(student);
				
			} else if (num == 2) {	//2.학생이름 입력
				input_name(student);
				
			} else if (num == 3) {
				print_sutdent(student);	//3.학색출력
				
			} else if (num == 4) {	//4.종료
				System.out.println("프로그램을 종료합니다.");
				break;
				
			} else {	//예외처리
				System.out.println("잘못입력하셨습니다.");
			}
			
			System.out.println("==============================");
			System.out.println();
		}
	}

	// 메뉴 선택화면.
	public static void showMenu() {
		System.out.println("1.학생인원 지정 2.학생이름 입력 3.전체 출력 4.종료");
	}

	// 1.학생수 지정
	public static String[] createSutdent(String[] student) {
		int student_num;
		
		System.out.println("학생 수를 입력하세요.");
		student_num = Integer.parseInt(get_str());
		student = new String[student_num];
		
		return student;
	}

	// 2.학생이름 입력
	public static void input_name(String[] student) {
		if(student == null) {
			System.out.println("학생 수를 먼저 입력하세요.");
			return;
		}
		
		for(int i=0; i<student.length; i++) {
			System.out.printf("%d번째 학생의 이름을 입력하세요.\n", i+1);
			student[i] = get_str();
		}
	}

	// 3.출력
	public static void print_sutdent(String[] student) {
		if(student == null) {
			System.out.println("학생 수를 먼저 입력하세요.");
			return;
		}
		
		for(int i=0; i<student.length; i++) {
			System.out.printf("%d번째 학생의 이름 : %s\n", i+1, student[i]);
		}
	}

	// 메뉴 선택 입력 받기
	public static String get_str() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		return str;
	}
}
