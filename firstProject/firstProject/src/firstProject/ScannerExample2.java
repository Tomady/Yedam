package firstProject;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		// 변수 : 사용자 입력(10, 20)
		// 10 + 20 = 30 
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오...");
		num1 = sc.nextInt();
		System.out.println("숫자를 입력하시오...");
		num2 = sc.nextInt();
		
		result = num1 + num2;
		
		System.out.println("결과는 : " + result);
	}
}
