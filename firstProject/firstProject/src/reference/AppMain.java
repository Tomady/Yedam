package reference;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {
		// 학생정보를 생성 학생점수 배열.
		// 1.학생인원 지정, 2.학생점수, 3.전체리스트, 4.분석:평균, 최고점, 5.종료
		int[] scores = null;

		while (true) {
			showMenu();

			int choice = readInt("번호를 선택하세요>>");

			if (choice == 1) {
				int size = createStudent();
				scores = new int[size];
				
			} else if (choice == 2) {
				inputValue(scores);

			} else if (choice == 3) {
				showList(scores);

			} else if (choice == 4) {
				analysis(scores);

			} else if (choice == 5) {
				break;
				
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
			System.out.println("==============================");
			System.out.println();
		}

		System.out.println("끝.");

	}

	public static void showMenu() {
		System.out.println("1.학생인원 지정, 2.학생점수, 3.전체리스트, 4.분석:평균, 최고점, 5.종료");
	}

	public static int createStudent() {
		int cnt = readInt("학생 수를 입력하세요.");
		
		return cnt;
	}

	public static void inputValue(int[] ary) {
		if (ary == null) {
			System.out.println("먼저 학생수를 입력하세요.");

		} else {
			for (int i = 0; i < ary.length; i++) {
				ary[i] = readInt("학생점수를 입력하세요.");
			}
		}
	}

	public static void showList(int[] ary) {
		if (ary == null) {
			System.out.println("먼저 학생수를 입력하세요.");

		} else {
			for (int i = 0; i < ary.length; i++) {
				// scores[0] => 88 형식으로 출력.
				System.out.printf("scores[%d] => %d\n", i, ary[i]);
			}
		}
	}

	public static void analysis(int[] ary) {
		// 평균, 최고점 => 콘솔.
		if (ary == null) {
			System.out.println("먼저 학생수를 입력하세요.");

		} else {
			// 평균 구하기
			int sum = 0;
			double avg = 0;

			for (int num : ary) {
				sum += num;
			}

			avg = (double) sum / ary.length;

			// 최고점 구하기.
			int maxVal = 0;

			for (int num : ary) {
				maxVal = maxVal < num ? num : maxVal;
			}

			System.out.printf("평균:%.2f , 최고점: %d\n", avg, maxVal);
		}
	}

	public static int readInt(String msg) {
		int menu = 0;
		Scanner sc = new Scanner(System.in);

		// 예외처리
		try {
			System.out.println(msg);
			menu = sc.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("잘못 입력하셨습니다. 문자입력.");
		}

		return menu;
	}
}
