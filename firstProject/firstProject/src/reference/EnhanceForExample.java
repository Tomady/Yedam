package reference;

public class EnhanceForExample {
	public static void main(String[] args) {
		String[] strAry = null;
		strAry = new String[5];	//null, null, null, null, null
		strAry = new String[] {"Hong", "Park", "Choi", "Kim", "Hwang"};
		int[] scores = {50, 70, 80, 60};
		int sum = 0;
		
		
		System.out.println(strAry.length);
		System.out.println();
		
		strAry[2] = "Hong";
		
		for(int i=0; i<strAry.length; i++) {
			if(strAry[i].equals("Hong")) {
				System.out.println(strAry[i]);
			}
		}
		
		System.out.println("===다시===");
		
		//Enhanced for
		for(String name : strAry) {
			System.out.println(name);
		}
		
		System.out.println();
		
		for(int score : scores) {
			sum += score;
		}
		
		//학생 3명. 4.2, 3.5, 2.8점수을 담을 수 있는 배열 선언
		//합계를 담을 수 있도록 변수.
		//평균을 계산해서 avg변수에 저장
		//출력 -> 학생평균: [점수]입니다. 
		double[] student_scores = {4.2, 3.5, 2.8};
		double d_sum = 0;
		double avg = 0;
		
		for(double sc : student_scores) {
			d_sum += sc;
		}
		
		avg = d_sum/student_scores.length;
		
		System.out.printf("학생평균: %.2f입니다.\n", avg);
	}
}
