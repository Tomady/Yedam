package firstProject;

import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {
		//"100" vs 100
		int num1 = 100;
		String num2 = "100";
		int num2Int = Integer.parseInt(num2); // int -> Integer
		
		String name = "0";
		int ageInt = 0;
		String age = "0";
		String phone = "0";
		
		String num3 = "12.25";
		double num3Double = Double.parseDouble(num3);
		
		int result = num1 + num2Int;
//		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력>>> ");
		name = sc.nextLine();
		
		System.out.println("나이를 입력>>> ");
		age = sc.nextLine();
		if(age.equals("")) {
			age = "0";
		}
		ageInt = Integer.parseInt(age);
		
		System.out.println("연락처를 입력>>> ");
		phone = sc.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.printf("이름: %s, 나이: %d, 연락처: %s\n", name, ageInt, phone);
		System.out.println("끝");
	}

}
