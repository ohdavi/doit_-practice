package chapter_03;

import java.util.Scanner;

public class Q_04 {

	static int seatchIdx(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;

		System.out.print("  |");
		for (int i = 0; i < n; i++) {
			System.out.printf("%4d", i);
		}
		System.out.print("\n--+");
		for (int i = 0; i < n * 4; i++) {
			System.out.print("-");
		}
		System.out.println();

		while (pl <= pr) {
			int pc = (pr + pl) / 2;

			System.out.print("  | ");

			if (pl != pc) {
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4 - 1), "", "");
			} else {
				System.out.printf(String.format("%%%ds<-*", pc * 4 + 1), "");
			}

			if (pc != pr) {
				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 1), "");
			} else {
				System.out.println("->");
			}

			System.out.printf(String.format("%2d|", pc));

			for (int i = 0; i < n; i++) {
				System.out.printf(String.format("%4d", a[i]));
			}
			System.out.println("\n  |");

			if (a[pc] == key) {
				return pc;
			} else if (a[pc] < key) {
				pl = pc + 1;
			} else if (a[pc] > key) {
				pr = pc - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int[] x = { 1, 2, 3, 5, 6, 8, 9 };

		System.out.print("검색할 값："); // 키값을 입력
		int ky = stdIn.nextInt();

		int idx = seatchIdx(x, x.length, ky);

		if (idx == -1) {
			System.out.println("일치하는 요소가 없습니다.");
		} else {
			System.out.println("\n" + ky + "는 x[" + idx + "]에 있습니다.");
		}
	}

}
