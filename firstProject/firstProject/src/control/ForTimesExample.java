package control;

public class ForTimesExample {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int k=2; k<10; k++) {
				System.out.printf("%dx%d=%2d\t", k, i, k*i);
			}
			System.out.println();
		}
	}
}
