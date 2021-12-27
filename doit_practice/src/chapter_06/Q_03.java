package chapter_06;

public class Q_03 {
	static void swap(int[] x, int a, int b) {
		int n = x[a];
		x[a] = x[b];
		x[b] = n;
	}

	static void bubbleSort(int[] a, int n) {
		int ccnt = 0; // 비교횟수
		int scnt = 0; // 교환횟수

		for (int i = 0; i < n - 1; i++) {
			int exchg = 0; // 패스의 교환횟수
			System.out.printf("패스%d：\n", i + 1);
			for (int j = n - 1; j > i; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);

				ccnt++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					scnt++;
					exchg++;
				}
			}
			for (int m = 0; m < n; m++)
				System.out.printf("%3d  ", a[m]);
			System.out.println();
			if(exchg == 0) break;
		}
		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환를 " + scnt + "회 했습니다.");
	}

	public static void main(String[] args) {
		int[] x = { 6, 4, 3, 7, 1, 9, 8 };
		int n = x.length;
		bubbleSort(x, n);
	}

}
