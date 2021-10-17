package operator;

public class OperatorExample2 {
	public static void main(String[] args) {
		//대입(할당)연산자
		int num1 = 0, num2 = 0, result = 0;
		
		num1 = num2 = 10;
		result = num1 + num2;
		
		result = result + 10;
		result += 10;	// result = result + 10;
		result -= 10;	// result = result - 10;
		result *= 10;	// result = result * 10;
		result /= 10;	// result = result / 10;
		result %= 10;	// result = result % 10;
		
		String str = "Hello";
		str = str + "World";
		str += " welcome";
		
		System.out.println(str);
		
		// 3항 연산자
		int score = 80;
		boolean pass = false;
		pass = (score > 60) ? true : false;
		String isOk = (score > 60) ? "Pass" : "Fail";
		
		
	}
}
