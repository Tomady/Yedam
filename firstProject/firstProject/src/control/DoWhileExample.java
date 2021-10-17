package control;

public class DoWhileExample {
	public static void main(String[] args) {
		boolean run = false;
		int cnt = 0;
		
		// Do..While
		while(run) {
			System.out.println("실행문1.");
		}//End_while
		
		do {
			cnt++;
			if(cnt%2 == 0) {
				continue;	// 다음순으로 skip
			}//End_if
			
			System.out.println(cnt);
			
			if(cnt >= 4) {
				break;
			}//End_if
			
//			System.out.println("실행문2.");
			
		}while(true);	//End_do_while
		
		System.out.println("끝.");
		
	}//End_main
}//End_class