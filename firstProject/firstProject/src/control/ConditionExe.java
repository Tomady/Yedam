package control;

public class ConditionExe {
	public static void main(String[] args) {
		// 두 정수 60, 70
		// 두 수를 합한 결과 100점 넘어서면 합격, 불합격 출력
		// 끝.
		int num1 = 60;
		int num2 = 70;

		if (num1+num2 > 100) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		System.out.println("끝.");

		// 두 수를 곱해서 짝수이면 짝수, 홀수이면 홀수 출력
		// 2번째 끝.
		if ((num1*num2)%2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		System.out.println("2번째 끝.");

		// num1 10을 나눈 뒤 2의 배수이면 2의 배수, 3의 배수이면 3의 배수, 2의 배수, 3의 배수 출력
		num1 = 6;

		if (num1%2 == 0 && num1%3 == 0) {
			System.out.println("2, 3의 공동배수입니다.");
		} else if (num1%2 == 0) {
			System.out.println("2의 배수입니다.");
		} else if (num1%3 == 0) {
			System.out.println("3의 배수입니다.");
		}

		System.out.println("3번째 끝.");
		System.out.println();
		
		
		int randomValue = (int)(Math.random() * 6) + 1;
//		System.out.println(randomValue);
		
		switch(randomValue) {
		case 1:
			System.out.println("1이 나왔습니다");
			break;
		case 2:
			System.out.println("2이 나왔습니다");
			break;
		case 3:
			System.out.println("3이 나왔습니다");
			break;
		case 4:
			System.out.println("4이 나왔습니다");
			break;
		case 5:
			System.out.println("5이 나왔습니다");
			break;
		case 6:
			System.out.println("6이 나왔습니다");
			break;
		default:
			break;	
		}
		
		System.out.println("4번 끝.");
		System.out.println();
		
		//0~99점까지 임의의 수 90점 이상a 80점b
		
		int randomNum = (int)(Math.random() * 100);
		
		if(randomNum >= 90) {
			System.out.println("A학점");
		}else if(randomNum >= 80) {
			System.out.println("B학점");
		}else if(randomNum >= 70) {
			System.out.println("C학점");
		}else if(randomNum >= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
		System.out.println("5번 끝.");
		System.out.println();
		
		switch(randomNum/10) {
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		case 6:
			System.out.println("D학점입니다.");
			break;
		default:
			System.out.println("F학점입니다.");
		}
		
		System.out.println(randomNum);
	}
}
