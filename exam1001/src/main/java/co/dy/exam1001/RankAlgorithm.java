package co.dy.exam1001;

import java.util.Arrays;

public class RankAlgorithm {
	private int[] grade = { 80, 100, 50, 86, 73, 42 };
	private int[] rank;

	private void rank() {
		rank = new int[grade.length];

//		for (int i = 0; i < rank.length; i++) {
//			rank[i] = 1;
//		}

		Arrays.fill(rank, 1);
		
		for (int i = 0; i < grade.length - 1; i++) {
			for (int k = i + 1; k < grade.length; k++) {
				if (grade[i] > grade[k]) {
					rank[k]++;
				} else if (grade[i] < grade[k]) {
					rank[i]++;
					
				}
			}
		}
	}

	@Override
	public String toString() {
		rank();

		for (int g : grade) {
			System.out.print(g + " ");
		}
		System.out.println();

		for (int r : rank) {
			System.out.print(r + " ");
		}

		return null;
	}

}
