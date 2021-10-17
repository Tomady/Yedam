package reference;

public class MethodExample3 {
	public static void main(String[] args) {
		int[] intAry = {30, 40, 50, 60, 70};
		int sum = 0;
		double avg = 0;
		
		for(int num : intAry) {
			sum += num;
		}
		
		System.out.println("합1: " + sum);
		avg = avgArray(intAry);
		System.out.println("평균1: " + avg);
		
		sum = 0;
		int[] intAry2 = {30, 40};
		sum = sumArray(intAry2);
		System.out.println("합2: " + sum);
		
		avg = avgArray(intAry2);
		System.out.println("평균2: " + avg);
		
	}
	
	//배열을 매개변수.
	public static int sumArray(int[] intAry) {
		int sum = 0;
		
		for(int num : intAry) {
			sum += num;			
		}
		
		return sum;
	}
	
	//배열을 매개변수 -> 평균.
	public static double avgArray(int[] intAry) {
		int sum = 0;
		
		sum = sumArray(intAry);
		
		return (double)sum/intAry.length;
	}
}
