package reference;

public class MethodExample4 {
	public static void main(String[] args) {
		int[] scores = { 88, 67, 92, 73, 58 };
		// 최대값 구하기
		int maxVal = 0;
		boolean isTrue = false;

		for (int i = 0; i < scores.length; i++) {
			isTrue = maxVal < scores[i];

			if (isTrue) {
				maxVal = scores[i];
			}
		}
		System.out.println("최대값1: " + maxVal);
		System.out.println("끝1.");
		System.out.println();

		int[] anotherAry = { 55, 82, 34, 19, 47, 89 };
		
		maxVal = getMaxValue(anotherAry);
		System.out.println("최대값2: " + maxVal);
		System.out.println("끝2.");
	}

	public static int getMaxValue(int[] ary) {
		// 최대값 구하기
		int maxVal = 0;
		boolean isTrue = false;

		for (int i = 0; i < ary.length; i++) {
			isTrue = maxVal < ary[i];

			if (isTrue) {
				maxVal = ary[i];
			}
		}

		return maxVal;
	}
}
