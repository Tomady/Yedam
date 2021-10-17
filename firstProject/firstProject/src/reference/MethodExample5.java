package reference;

public class MethodExample5 {
	public static void main(String[] args) {
		int[] scores = { 88, 67, 92, 73, 58 };

		// 최소값을 구하는 코드.
		int minVal = 100;
		boolean isTrue = false;

		for (int i = 0; i < scores.length; i++) {
			isTrue = minVal > scores[i];

			if (isTrue) {
				minVal = scores[i];
			}
		}
		System.out.println("최소값1: " + minVal);
		System.out.println("끝1.");

		// Method를 통한 최소값을 구하는 코드.
		minVal = getMinValue(scores);
		System.out.println("최소값2: " + minVal);
		System.out.println("끝2.");

	}

	public static int getMinValue(int[] ary) {
		// 최소값 구하기
		int minVal = 100;
		boolean isTrue = false;

		for (int i = 0; i < ary.length; i++) {
			isTrue = minVal > ary[i];

			if (isTrue) {
				minVal = ary[i];
			}
		}

		return minVal;
	}
}
