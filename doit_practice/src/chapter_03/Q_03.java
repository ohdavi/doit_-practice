package chapter_03;

import java.util.Scanner;

public class Q_03 {

	static int seatchIdx(int[] a, int n, int key, int[] idx) {
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				idx[j] = i;
				j++;
			}
		}
		return j;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int[] x = { 1, 9, 2, 9, 4, 6, 7, 9 };
		int[] idx = new int[x.length];

		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "]：" + x[i]);
		}

		System.out.print("검색할 값："); // 키값을 입력
		int ky = stdIn.nextInt();

		int sidx = seatchIdx(x, x.length, ky, idx);

		System.out.println("배열 a와 일치하는 요솟수의 수 : " + sidx);

	}

}
