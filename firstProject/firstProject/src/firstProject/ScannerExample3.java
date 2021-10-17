package firstProject;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		//영어점수입력:
		//수학점수입력:
		//이름입력:
		//홍길동님의 영어, 수학점수의 합은?, 평균은 ? 입니다 printf출력
		
		int score_eng = 0;
		int score_math = 0;
		int sum = 0;
		double avg = 0;
		String name = "정도영";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어점수 입력");
		score_eng = sc.nextInt();
		System.out.println("수학점수 입력");
		score_math = sc.nextInt();
		
		sum = score_eng + score_math;
		avg = (double)sum/2;
		
		System.out.printf("%s님의 영어,수학점수의 합은 %d, 평균은 %f 입니다.", name, sum, avg);
		
	}

}
