package chapter_06;

public class Q_02 {
	static void swap(int[] x, int a, int b) {
		int n = x[a];
		x[a] = x[b];
		x[b] = n;
	}

	static void bubbleSort(int[] x) {
		int count1 = 0; // 비교
		int count2 = 0; // 교환

		for (int i = 0; i < x.length - 1; i++) {
			System.out.println("패스" + (i + 1) + ": ");
			for (int j = x.length - 1; j > i; j--) {
				count1++;
				for (int m = 0; m < j - 1; m++) {
					System.out.print(x[m] + " ");
				}
				if (x[j - 1] > x[j]) {
					System.out.print(x[j - 1] + "+" + x[j]);
					count2++;
					swap(x, j - 1, j);
				} else {
					System.out.print(x[j - 1] + "-" + x[j]);
				}
				for (int m = j + 1; m < x.length; m++) {
					System.out.print(" " + x[m]);
				}
				System.out.println();
			}
			for (int m = 0; m < x.length; m++) {
				System.out.print(x[m] + " ");
			}
			System.out.println();
		}
		System.out.println("비교를 " + count1 + "회 했습니다.");
		System.out.println("교환을 " + count2 + "회 했습니다.");
	}

	//답안지
//	static void bubbleSort(int[] a, int n) {
//		int ccnt = 0; // 비교횟수
//		int scnt = 0; // 교환횟수
//
//		for (int i = 0; i < n - 1; i++) {
//			System.out.printf("패스%d：\n", i + 1);
//			for (int j = n - 1; j > i; j--) {
//				for (int m = 0; m < n - 1; m++)
//					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
	// 교환 수행 기호 출력 부분을 더 깔끔하게 만들었다. printf 출력문과 삼항연산자 공부를 더 해서 이용해야겠다.
//				System.out.printf("%3d\n", a[n - 1]);
//
//				ccnt++;
//				if (a[j - 1] > a[j]) {
//					scnt++;
//					swap(a, j - 1, j);
//				}
//			}
//			for (int m = 0; m < n; m++)
//				System.out.printf("%3d  ", a[m]);
//			System.out.println();
//		}
//		System.out.println("비교를 " + ccnt + "회 했습니다.");
//		System.out.println("교환를 " + scnt + "회 했습니다.");
//	}
	
	public static void main(String[] args) {
		int[] x = { 6, 4, 3, 7, 1, 9, 8 };
		bubbleSort(x);
//		int n = x.length;
//		bubbleSort(x,n);
	}

}