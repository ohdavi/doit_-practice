package chapter_06;

public class Q_09 {
	// 셸 정렬

	// 버전1
	static int shellSort1(int[] x, int n) {
		int cnt = 0; // 이동 횟수
		for (int h = n / 2; h > 0; h /= 2) {
			for (int i = h; i < n; i++) {
				int j;
				int tmp = x[i];
				for (j = i - h; j >= 0 && x[j] > tmp; j -= h) {
					x[j + h] = x[j];
					cnt++;
				}
				x[j + h] = tmp;
				cnt++;
			}
		}
		return cnt;
	}

	// 버전2
	static int shellSort2(int[] x, int n) {
		int cnt = 0; // 이동 횟수
		int h;
		for (h = 1; h < n / 9; h = h * 3 + 1) {
			// h의 초깃값
		}
		for (; h > 0; h /= 3) {
			for (int i = h; i < n; i++) {
				int j;
				int tmp = x[i];
				for (j = i - h; j >= 0 && x[j] > tmp; j -= h) {
					x[j + h] = x[j];
					cnt++;
				}
				x[j + h] = tmp;
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		int[] x1 = { 6, 4, 8, 3, 1, 9, 7, 2, 5 };
		int n = x1.length;

		int a = shellSort1(x1, n);

		System.out.println("버전1 이동 횟수: " + a);

		int[] x2 = { 6, 4, 8, 3, 1, 9, 7, 2, 5 };

		int b = shellSort2(x2, n);
		System.out.println("버전2 이동 횟수: " + b);
	}

}
