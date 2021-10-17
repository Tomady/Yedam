package firstProject;

public class VariableExample {
	public static void main(String[] args) {
		int number1 = 10;
		number1 = 20;
		number1 = 30;
		System.out.println("결과 : " + number1);
		
		int number3 = 90;
		int result = 0;
		
		final int number2 = 20;
//		number2 = 30;
		
		result = number1 + number2;
		double result1 = (double)number3 / 11;
		System.out.println("결과값 : " + result1);
	}
}
