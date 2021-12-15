package chapter_02;

import java.util.Scanner;

public class Q_06 {
	// 기수 변환

	// 나머지를 구하는 순서대로 저장되어서 맨 앞쪽이 마지막 자리가 되어 있다.
	// 아랫자리가 맨앞에 저장됨.
	static int cardConvR(int x, int r, char[] d) { // 변환할 정수, 변환할 진수, 변환 후 넣어둘 배열
		int n = 0;
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// 반복횟수는 정해져 있지 않고 변환할 정수의 값이 0이 될때까지 반복
		// n에 반복횟수가 저장됨.
		do {
			d[n++] = str.charAt(x % r);
			x /= r;
		} while (x != 0);
		return n;
	}

	// 앞쪽에 윗자리가 저장되게 만들어라.
	static int cardConv(int x, int r, char[] d) {
		int n = 0;
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[n++] = str.charAt(x % r);
			x /= r;
		} while (x != 0);

		// 배열 요소 역순으로 정리하기
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

		// int nr = cardConv(x, r, d);
		int n = cardConv(x, r, d);

		System.out.print(r + "진수로 ");
		for (int i = 0; i < n; i++) {
			System.out.print(d[i]);
		}
		System.out.println("입니다.");

	}

}
