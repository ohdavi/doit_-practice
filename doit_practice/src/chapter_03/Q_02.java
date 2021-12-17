package chapter_03;

import java.util.Scanner;

public class Q_02 {
	// 선형 검색의 스캐닝 과정을 상세하게 출력하라.
	// 검색하는 요소의 인덱스를 출력하고 검색요소의 위에 *표시 출력
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;

		System.out.print(" | ");
		for (int j = 0; j < n; j++) {
			System.out.print(j + "\t");
		}
		System.out.println();
		System.out.println("--+-------------------------------");

		for (i = 0; i < n; i++) {
			// 스캐닝 과정
			System.out.print(" | ");
			for (int j = 0; j < i; j++)
				System.out.print("\t");
			System.out.println("*");
			System.out.print(i+"| ");
			for (int j = 0; j < n; j++)
				System.out.print(a[j]+"\t");
			System.out.println("\n |");
			if (a[i] == key)
				break;
		}

		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];				// 요솟수 num + 1

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		System.out.print("검색할 값："); // 키값을 입력
		int ky = stdIn.nextInt();

		int idx = seqSearchSen(x, num, ky); // 배열x에서 값이 ky인 요소를 검색

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
}