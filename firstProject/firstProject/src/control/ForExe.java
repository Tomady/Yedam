package control;

public class ForExe {

	public static void main(String[] args) {
		int sum=0;
		
		// 1~10 출력
		// 끝1.
		
		for(int i=1; i<11; i++) {
			System.out.println(i);
		}
		
		System.out.println("끝1.");
		System.out.println();
		
		// 1~10 중에서 짝수 출력
		for(int i=2; i<11; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("끝2.");
		System.out.println();
		
		// 1~10 중에서 홀수 출력
		for(int i=1; i<11; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("끝3.");
		System.out.println();
		
		// 1~10까지 합을 구하도록. => 1
		for(int i=1; i<11; i++) {
			sum += i;
		}		
		
		System.out.printf("합계: %d\n", sum);
		System.out.println("끝4.");
		System.out.println();
	}
}
