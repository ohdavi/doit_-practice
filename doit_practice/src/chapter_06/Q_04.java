package chapter_06;

public class Q_04 {
	static void swap(int[] x, int a, int b) {
		int n = x[a];
		x[a] = x[b];
		x[b] = n;
	}

	static void bubbleSort(int[] a, int n) {
		int ccnt = 0; // 비교횟수
		int scnt = 0; // 교환횟수
		int k = 0; // a[k]보다 앞쪽은 정렬완료
		int i = 0; // pass

		while (k < n - 1) {
			System.out.printf("패스%d：\n", i++);
			int last = n - 1; // 가장 마지막에 교환한 위치

			for (int j = n - 1; j > k; j--) {
				for (int m = 0; m < n - 1; m++) {
					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				}
				System.out.printf("%3d\n", a[n - 1]);
				ccnt++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					scnt++;
					last = j;
				}
			}
			k = last;

			for (int m = 0; m < n; m++) {
				System.out.printf("%3d  ", a[m]);
			}
			System.out.println();
		}
		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환를 " + scnt + "회 했습니다.");
	}

	public static void main(String[] args) {
		int[] x = { 1, 3, 9, 4, 7, 8, 6 };
		int n = x.length;
		bubbleSort(x, n);
	}

}
