package control;

public class WhileExe {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		
		// while 구문을 1~10까지 출력.
		while(i<11) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("끝1.");
		System.out.println();
		
		// while 구문을 짝수 출력
		i=0;
		while(i<10) {
			i+=2;
			System.out.println(i);
		}
		
		System.out.println("끝2.");
		System.out.println();
		
		// while 구문을 홀수 출력
		i=1;
		while(i<9) {
			i+=2;
			System.out.println(i);
		}
		
		System.out.println("끝3.");
		System.out.println();
		
		// while 구문을 1~10 합.
		i=1;
		while(i<11) {
			sum+=i;
			i++;
		}
		
		System.out.println(sum);
		System.out.println("끝4.");
		
	}
}
