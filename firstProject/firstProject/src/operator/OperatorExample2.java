package operator;

public class OperatorExample2 {
	public static void main(String[] args) {
		//����(�Ҵ�)������
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
		
		// 3�� ������
		int score = 80;
		boolean pass = false;
		pass = (score > 60) ? true : false;
		String isOk = (score > 60) ? "Pass" : "Fail";
		
		
	}
}