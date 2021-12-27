package chapter_06;

public class Q_05 {

	static void swap(int[] x, int idx1, int idx2) {
		int n = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = n;
	}

	// 양방향 버블 정렬
	// 패스의 스캔 방향을 교대로 바꾸면 더 적은 횟수로 비교할 수 있다.
	static void bidirectionBubbleSort(int x[], int n) {
		for (int i = 0; i < n - 1; i++) {
			int exchg = 0;
			if (i % 2 == 0) {
				// 짝수번째 패스에는 가장 큰 요소를 맨 뒤로 옮기는 방식
				for (int j = 0; j < n - 1; j++) {
					if (x[j] > x[j + 1]) {
						exchg++;
						swap(x, j, j + 1);
					}
				}
			} else {
				// 홀수번째 패스에는 가장 작은 요소를 맨앞으로
				for (int j = n - 1; j > i; j--) {
					if (x[j - 1] > x[j]) {
						exchg++;
						swap(x, j - 1, j);
					}
				}
			}
			if (exchg == 0)
				break;
		}
	}

	// 답안지
	static void shakerSort(int[] a, int n) {
		int left = 0;
		int right = n - 1;
		int last = right;

		while (left < right) {
			for (int j = right; j > left; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			}
			left = last;

			for (int j = left; j < right; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					last = j;
				}
			}
			right = last;
		}
	}

	public static void main(String[] args) {
		int[] x = { 9, 1, 3, 4, 6, 7, 8 };
		int n = x.length;

		bidirectionBubbleSort(x, n);
//		shakerSort(x, n);
		
		for (int i = 0; i < n; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
	}

}
