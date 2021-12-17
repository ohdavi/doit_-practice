package chapter_03;

import java.util.Scanner;

public class Q_05 {
	// 같은 값을 갖는 요소가 하나 이상일 때 그 요소 중에서 맨 앞의 요소를 찾기
	static int binSearchX(int[] a, int n, int key) {
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

			System.out.print("  |");

			for (int i = 0; i < n; i++) {
				System.out.printf(String.format("%4d", a[i]));
			}

			if (a[pc] == key) {
				int i = 1;
				while(a[pc-i] == a[pc]) {
					pc--;
					if(a[pc-i] != a[pc]) {
						return pc;
					}
				}
				//답안지
//				for (; pc > pl; pc--) // key와 같은 맨 앞의 요소를 찾습니다
//					if (a[pc - 1] < key)
//						break;
				//초기화 안하고 쓸 수 있는 건지 몰랐다..
				//나는 인덱스 안에 있는 값과 비교했는데 키 값과 비교하는게 더 정확해보인다.
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

		int[] x = { 1, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9 };

		System.out.print("검색할 값："); // 키값을 입력
		int ky = stdIn.nextInt();

		int idx = binSearchX(x, x.length, ky);

		if (idx == -1) {
			System.out.println("일치하는 요소가 없습니다.");
		} else {
			System.out.println("\n" + ky + "는 x[" + idx + "]에 있습니다.");
		}
	}

}
