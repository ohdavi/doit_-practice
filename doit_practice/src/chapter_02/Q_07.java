package chapter_02;

import java.util.Scanner;

public class Q_07 {
	// 기수 변환 과정을 자세히 나타내도록 만들기

	static int cardConv(int x, int r, char[] d) {
		int n = 0;
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[n++] = str.charAt(x % r);
			System.out.println(r + " |      " + x);
			x /= r;
			System.out.println("  +---------");
		} while (x != 0);

		for (int i = 0; i < n / 2; i++) {
			char t = d[i];
			d[i] = d[n - i - 1];
			d[n - i - 1] = t;
		}

		return n;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] d = new char[36];

		System.out.println("10진수를 기수 변환합니다.");

		System.out.print("변환하는 음이 아닌 정수 : ");
		int x = scan.nextInt();

		System.out.print("어떤 진수로 변환할까요?(2-36) : ");
		int r = scan.nextInt();
		while (r < 2 || r > 36) {
			System.out.print("다시 입력해주세요 : ");
			r = scan.nextInt();
		}

		int n = cardConv(x, r, d);

		System.out.print(r + "진수로 ");
		for (int i = 0; i < n; i++) {
			System.out.print(d[i]);
		}
		System.out.println("입니다.");

	}

}
