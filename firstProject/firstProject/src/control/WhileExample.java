package control;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1;
		int cnt = 0;
		boolean run = true;
		
		while(i <= 10) {
			System.out.printf("i의 값은 %d\n", i);
			i++;
		}
		
		System.out.println();
		
		while(run) {
			cnt = (int)(Math.random() * 10) + 1;
			System.out.println(cnt);
			
			if(cnt == 8) {
				run = false;
			}
		}
		
		System.out.println("끝.");
		System.out.println();
	}
}
