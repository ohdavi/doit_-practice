package chapter_06;

public class Q_10 {

	static void swap(int[] x, int idx1, int idx2) {
		int n = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = n;
	}

	// 퀵 정렬, quick sort : 배열x, 나눌 구간의 첫번째 요소, 마지막 요소의 인덱스를 매개변수로 받는다.
	static void quickSort(int[] x, int left, int right) {
		int pl = left;
		int pr = right;
		int a = x[(pl + pr) / 2];

		// 배열을 나누는 과정을 출력
		System.out.printf("a[%d]~a[%d]：{", left, right);
		for (int i = left; i < right; i++)
			System.out.printf("%d , ", x[i]);
		System.out.printf("%d}\n", x[right]);

		do {
			while (x[pl] < a)
				pl++; // x보다 큰 값을 만날 때까지 오른쪽으로 스캔
			while (x[pr] > a)
				pr--; // x보다 작은 값을 만날 때까지 왼쪽으로 스캔
			if (pl <= pr) {
				swap(x, pl++, pr--);
			}
		} while (pl <= pr);

		if (left < pr) {
			quickSort(x, left, pr);
		}
		if (pl < right) {
			quickSort(x, pl, right);
		}

//		System.out.println("피벗 : " + a);
//
//		// 피벗 이하의 그룹, [0]~[pl-1]
//		for (int i = 0; i < pl - 1; i++) {
//			System.out.print(x[i] + " ");
//		}
//		System.out.println();
//
//		// 피벗과 일치하는 그룹, [pr+1]~[pl-1]
//		for (int i = pr + 1; i <= pl - 1; i++) {
//			System.out.print(x[i] + " ");
//		}
//		System.out.println();
//
//		// 피벗 이상의 그룹, [pr+1]~[n-1]
//		for (int i = pr + 1; i < x.length; i++) {
//			System.out.print(x[i] + " ");
//		}
//		System.out.println();
	}

	static void quickSort(int[] a, int n) {
		quickSort(a, 0, n - 1);
	}

	public static void main(String[] args) {
		int[] x = { 6, 4, 8, 3, 1, 9, 7, 2, 5 };
		quickSort(x, x.length);

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}

	}

}
