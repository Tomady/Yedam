package reference;

public class MethodExample2 {

	//두 정수를 입력 받아서 두 수의 합을 출력하는 메소드
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("두 수의 합은: " + sum);
	}
	
	//두 정수를 입력 받아서 두 수의 곱을 출력하는 메소드
	public static void multi(int n1, int n2) {
		int multi = n1 * n2;
		System.out.println("두 수의 곱은: " + multi);
	}
	
	//정사각형 넓이 계산해주는 메소드.
	public static void getArea(double side) {
		double area = side * side;
		System.out.println("정사각형의 넓이: " + area);	
	}
	
	//두 수 중에서 큰 값을 반환 해주는 메소드.
	public static int getMax(int n1, int n2) {
		int result = n1 > n2 ? n1 : n2;
		
		return result;
	}
	
	//두 수를 입력 받아서 첫 번째 값을 두 번째 값으로 나눈 결과를 반환 해주는 메소드.(첫 번째/두 번째)
	public static double divide(int n1, int n2) {
		double result = n1/n2;
		
		return result;
	}
	
	public static void main(String[] args) {
		sum(24, 55);
				
		int a = 45, b = 77;
		
		sum(a, b);
		multi(35, 88);
		getArea(3.5);
		
		int res = getMax(a, b);
		
		System.out.println("큰 수는: " + res);
		
		double res1 = divide(12, 11);
		
		System.out.println("두 수를 나눈 결과: " + res1);
	}
}
