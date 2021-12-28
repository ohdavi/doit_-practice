package chapter_06;

import java.util.Scanner;

public class Q_07 {
	static void swap(int[] x, int idx1, int idx2) {
		int n = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = n;
	}

	// 단순 삽입 정렬
	static void insertionSort(int[] x, int n) {
		for (int i = 2; i < n; i++) {
			int tmp = x[0] = x[i];
			int j;
			for (j = i; x[j - 1] > tmp; j--) {
				x[j] = x[j - 1];
			}
			if (j > 0) {
				x[j] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int n = scan.nextInt();
		int[] x = new int[n + 1]; // 1개 여분으로 생성

		// x[1]부터 데이터를 저장하면 x[0]을 보초로하여 삽입을 마치는 조건을 줄일 수 있다.
		for (int i = 1; i <= n; i++) { // [0]은 보초여서 비워둬야 한다
			System.out.print("x[" + i + "]：");
			x[i] = scan.nextInt();
		}

		insertionSort(x, n+1);

		for (int i = 1; i <= n; i++) {
			System.out.println("x[" + i + "]＝" + x[i]);
		}
	}

}
