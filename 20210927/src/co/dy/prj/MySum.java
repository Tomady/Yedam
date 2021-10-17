package co.dy.prj;

public class MySum {
	private int num1;
	private int num2;

	MySum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	private void sum() {
		int sum = 0;

		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		
		System.out.println("두 수의 합: " + sum);
	}
	
	public void run() {
		sum();
	}
}
