package co.dy.prj;

public class CompareMax { // ���޹��� �� ������ ū ���� �����Ѵ�.
	private int n;
	private int m;

	public CompareMax(int n, int m) { // ������
		this.n = n;
		this.m = m;
	}

	public int getMax() {
		int max = 0; // �� ���� ���� ���� 0�� �����Ѵ�.

		if (n > m) {
			max = n;

		} else if (n < m) {
			max = m;
		}

		return max;
	}
}
