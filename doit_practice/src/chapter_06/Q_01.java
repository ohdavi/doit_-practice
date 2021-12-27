package chapter_06;

import java.util.Scanner;

public class Q_01 {
	static void bubbleSort(int[] x) {
		for (int i = 1; i < x.length; i++) {
			for (int j = 0; j < x.length - i; j++) {
				if (x[j] > x[j + 1]) {
					int n = x[j];
					x[j] = x[j + 1];
					x[j + 1] = n;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] x = { 23, 74, 40, 85, 39, 11, 66 };

		bubbleSort(x);

		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] : " + x[i]);
		}
	}

}
