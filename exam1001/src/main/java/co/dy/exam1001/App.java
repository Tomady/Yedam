package co.dy.exam1001;

/**
 * Hello world!
 *
 */
public class App {
	private static int[] arr = { 7, 9, 3, 6, 1, 4, 2, 5, 8, 10 };

	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		selectionSort();
//		
//		toPrint();
//		
//		System.out.println("==========");
//		newSelectionSrot();
//		
//		toPrint();
		
		
		RankAlgorithm rankAlgorithm = new RankAlgorithm();
		rankAlgorithm.toString();
		
	}

	private static void toPrint() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	private static void selectionSort() {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[i] < arr[k]) {
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			} // end_for2
		} // end_for1
	}

	private static void newSelectionSrot() {
		int min = 0; // 인덱스의 위치값을 기억할 변수
		int temp = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[min] > arr[k]) {
					min = k;
				}
			}

			if (i != min) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}

	}
}
