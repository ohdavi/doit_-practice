package chapter_06;

public class Q_06 {
	static void swap(int[] x, int idx1, int idx2) {
		int n = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = n;
	}

	// 단순 선택 정렬
	static void selectionSort(int[] x, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (x[j] < x[min]) {
					min = j;
				}
			}
			// *, + , 공백 출력
			for (int m = 0; m < n; m++) {
				System.out.print((m == i) ? "  * " : (m == min) ? "  + " : "   ");
			}
			System.out.println();

			for (int k = 0; k < n; k++) {
				System.out.print("  " + x[k]);
			}
			System.out.println();

			swap(x, i, min);
		}
	}

	public static void main(String[] args) {
		int[] x = { 6, 4, 8, 3, 1, 9, 7 };
		int n = x.length;

		selectionSort(x, n);
	}
}
