package reference;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		
		//
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}//End_for
		
		System.out.println("끝1.");
		System.out.println();
		
		// 1-10까지 반복, 짝수만 출력.
		for(int i=2; i<11; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}//End_if
		}//End_for
		
		System.out.println("끝2.");
		System.out.println();
		
		// 1-10까지 반복, 홀수만 합하기
		for(int i=1; i<11; i++) {
			if(i%2 == 1) {
				sum += i;
			}//End_if
		}//End_for
		
		System.out.println("합계: " + sum);
		System.out.println("끝3.");
		System.out.println();
		
		// 1-10까지 반복, sum의 값이 20을 넘어서는 그때의 횟수. 
		sum = 0;
		
		for(int i=1; i<11; i++) {
			if(sum > 20) {
				cnt = i;
				break;
			}//End_if
			
			sum += i;
		}//End_for
		
		System.out.println("횟수: " + cnt);
		
	}//End_main
}//End_class
