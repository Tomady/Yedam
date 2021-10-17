package control;

public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;
		int i=1;
		int sum = 0;
		int r_num = 0;
		
		// do_while구문으로 1부터 10까지 출력
		// 끝.1
		do {
			System.out.println(i);
			i++;
		}while(i<11);	//End_do_while
		
		System.out.println("끝1.");
		System.out.println();
		
		// 짝수만 출력 continue 사용
		i=1;
		
		do {
			i++;
			
			if(i%2 == 1) {
				continue;
			}	//End_if
			
			System.out.println(i);
			
		}while(i<11);	//End_do_while
		
		System.out.println("끝2.");
		System.out.println();
		
		// 홀수만 출력
		i=0;
		
		do {
			i++;
			
			if(i%2 == 0) {
				continue;
			}//End_if
			
			sum += i;
			
		}while(i<10);	//End_do_while
		
		System.out.println("홀수 합계: " + sum);
		System.out.println("끝3.");
		System.out.println();
		
		// 임의의 값을 1~10;
		// sum 값이 100보다 큰 수가 되었을 때
		// 그 때의 sum 값을 출력... 몇 번 실행을 했는지 출력
		
		sum = 0;
		i = 0;
		
		do {
			r_num = (int)(Math.random()*10) + 1;
			sum += r_num;
			i++;
		}while(sum < 100);//End_do_while
		
		System.out.printf("sum 값: %d, 실행 수: %d\n", sum, i);
		System.out.println("끝4.");
		
		
		
	}//End_main
}//End_class
